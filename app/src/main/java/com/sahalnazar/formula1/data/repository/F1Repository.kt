package com.sahalnazar.formula1.data.repository

import com.sahalnazar.formula1.data.api.F1ApiService
import com.sahalnazar.formula1.data.model.Driver
import com.sahalnazar.formula1.data.model.Race
import javax.inject.Inject

class F1Repository @Inject constructor(
    private val apiService: F1ApiService
) {

    suspend fun getTopDriver(): Result<Driver> {
        return try {
            val response = apiService.getDrivers()
            val topDriver = response.drivers.find { it.position == 1 }
            if (topDriver != null) {
                Result.success(topDriver)
            } else {
                Result.failure(Exception("No driver found with position 1"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getRaceSchedule(): Result<List<Race>> {
        return try {
            val response = apiService.getRaceSchedule()
            Result.success(response.schedule)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
