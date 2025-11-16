package com.sahalnazar.formula1.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sahalnazar.formula1.data.model.Driver
import com.sahalnazar.formula1.data.model.Race
import com.sahalnazar.formula1.data.repository.F1Repository
import com.sahalnazar.formula1.ui.component.RaceTime
import com.sahalnazar.formula1.util.DateUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class UpcomingSessionUiData(
    val sessionName: String,
    val date: String,
    val raceTime: RaceTime
)

data class HomeUiState(
    val isLoading: Boolean = true,
    val topDriver: Driver? = null,
    val upcomingRace: Race? = null,
    val upcomingSessionUiData: UpcomingSessionUiData? = null,
    val error: String? = null
)

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: F1Repository
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.value = HomeUiState(isLoading = true)

            val driverResult = repository.getTopDriver()
            val scheduleResult = repository.getRaceSchedule()

            val driver = driverResult.getOrNull()
            val schedule = scheduleResult.getOrNull()

            val currentTime = System.currentTimeMillis() / 1000
            val upcomingRace = schedule
                ?.filter { it.raceEndTime > currentTime }
                ?.minByOrNull { it.raceStartTime }

            val nextSession = upcomingRace?.sessions
                ?.filter { it.startTime > currentTime }
                ?.minByOrNull { it.startTime }

            val upcomingSessionUiData = nextSession?.let { session ->
                UpcomingSessionUiData(
                    sessionName = session.sessionName,
                    date = DateUtils.formatSessionDate(session.startTime),
                    raceTime = RaceTime(
                        time = DateUtils.formatSessionTime(session.startTime),
                        amOrPm = DateUtils.formatSessionAmPm(session.startTime)
                    )
                )
            }

            _uiState.value = HomeUiState(
                isLoading = false,
                topDriver = driver,
                upcomingRace = upcomingRace,
                upcomingSessionUiData = upcomingSessionUiData,
                error = when {
                    driverResult.isFailure && scheduleResult.isFailure -> "Failed to load data"
                    driverResult.isFailure -> "Failed to load driver data"
                    scheduleResult.isFailure -> "Failed to load race schedule"
                    upcomingRace == null -> "No upcoming races found"
                    else -> null
                }
            )
        }
    }
}
