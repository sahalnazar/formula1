package com.sahalnazar.formula1.ui.screen.racedetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sahalnazar.formula1.data.model.Race
import com.sahalnazar.formula1.util.DateUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import java.util.Locale
import javax.inject.Inject

data class RaceHeaderUiData(
    val round: String,
    val raceName: String,
    val location: String,
    val dateRange: String,
    val nextSessionName: String,
    val daysUntil: String,
    val hoursUntil: String,
    val minutesUntil: String,
)

data class RaceDetailsUiData(
    val circuitName: String,
    val description: String,
    val facts: List<String>
)

@HiltViewModel
class RaceDetailViewModel @Inject constructor() : ViewModel() {

    private val _selectedRace = MutableStateFlow<Race?>(null)

    val raceDetailsUiData: StateFlow<RaceDetailsUiData?> = _selectedRace.map { race ->
        race?.let {
            val circuitName = race.circuitId.replace("_", " ").split(" ")
                .joinToString(" ") { it.replaceFirstChar { char -> char.uppercase() } }

            RaceDetailsUiData(
                circuitName = circuitName,
                description = com.sahalnazar.formula1.data.model.CircuitData.DESCRIPTION,
                facts = com.sahalnazar.formula1.data.model.CircuitData.FACTS
            )
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = null
    )

    val raceHeaderUiData: StateFlow<RaceHeaderUiData?> = _selectedRace.map { race ->
        race?.let {
            val dateRange = DateUtils.formatDateRange(race.raceStartTime, race.raceEndTime)
            val location = race.circuitId.replace("_", " ").replaceFirstChar { it.uppercase() }

            val currentTime = System.currentTimeMillis() / 1000
            val nextSession = race.sessions
                .filter { it.startTime > currentTime }
                .minByOrNull { it.startTime }

            val (days, hours, minutes) = if (nextSession != null) {
                DateUtils.calculateTimeUntil(nextSession.startTime)
            } else {
                Triple(0L, 0L, 0L)
            }

            RaceHeaderUiData(
                round = "Round ${race.round}",
                raceName = race.raceName,
                location = location,
                dateRange = dateRange,
                nextSessionName = nextSession?.sessionName ?: "Session",
                daysUntil = String.format(Locale.getDefault(), "%02d", days),
                hoursUntil = String.format(Locale.getDefault(), "%02d", hours),
                minutesUntil = String.format(Locale.getDefault(), "%02d", minutes)
            )
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = null
    )

    fun setSelectedRace(race: Race) {
        _selectedRace.value = race
    }
}
