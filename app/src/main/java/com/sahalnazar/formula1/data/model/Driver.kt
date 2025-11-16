package com.sahalnazar.formula1.data.model

import kotlinx.serialization.Serializable

@Serializable
data class DriverResponse(
    val drivers: List<Driver>
)

@Serializable
data class Driver(
    val driverId: String,
    val firstName: String,
    val lastName: String,
    val driverCode: String,
    val racingNumber: Int,
    val teamId: String,
    val teamName: String,
    val position: Int,
    val points: Int,
    val wins: Int,
    val podiums: Int,
    val poles: Int
)