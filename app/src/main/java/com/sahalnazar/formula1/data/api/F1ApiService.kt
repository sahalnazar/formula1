package com.sahalnazar.formula1.data.api

import com.sahalnazar.formula1.data.model.DriverResponse
import com.sahalnazar.formula1.data.model.RaceScheduleResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject

class F1ApiService @Inject constructor(
    private val client: HttpClient
) {

    suspend fun getDrivers(): DriverResponse {
        return client.get("${ApiConstants.BASE_URL}${ApiConstants.DRIVERS_ENDPOINT}").body()
    }

    suspend fun getRaceSchedule(): RaceScheduleResponse {
        return client.get("${ApiConstants.BASE_URL}${ApiConstants.RACE_SCHEDULE_ENDPOINT}").body()
    }
}
