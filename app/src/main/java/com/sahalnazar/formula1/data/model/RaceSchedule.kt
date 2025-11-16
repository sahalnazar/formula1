package com.sahalnazar.formula1.data.model

import kotlinx.serialization.Serializable

@Serializable
data class RaceScheduleResponse(
    val schedule: List<Race>
)

@Serializable
data class Race(
    val raceId: String,
    val circuitId: String,
    val raceName: String,
    val round: Int,
    val raceState: String,
    val raceStartTime: Long,
    val raceEndTime: Long,
    val isSprint: Boolean,
    val sessions: List<Session>,
    val podium: List<String>? = null
)

@Serializable
data class Session(
    val sessionId: String,
    val sessionName: String,
    val sessionType: String,
    val sessionState: String,
    val startTime: Long,
    val endTime: Long
)