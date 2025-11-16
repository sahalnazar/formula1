package com.sahalnazar.formula1.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateUtils {

    fun formatDateRange(startTimeSeconds: Long, endTimeSeconds: Long): String {
        return try {
            val startDate = Date(startTimeSeconds * 1000)
            val endDate = Date(endTimeSeconds * 1000)
            val dateFormat = SimpleDateFormat("dd MMM", Locale.getDefault())
            "${dateFormat.format(startDate)} - ${dateFormat.format(endDate)}"
        } catch (e: Exception) {
            "--"
        }
    }

    fun formatSessionDate(startTimeSeconds: Long): String {
        return try {
            val sessionDate = Date(startTimeSeconds * 1000)
            val dateFormat = SimpleDateFormat("dd EEEE", Locale.getDefault())
            dateFormat.format(sessionDate)
        } catch (e: Exception) {
            "--"
        }
    }

    fun formatSessionTime(startTimeSeconds: Long): String {
        return try {
            val sessionDate = Date(startTimeSeconds * 1000)
            val timeFormat = SimpleDateFormat("h:mm", Locale.getDefault())
            timeFormat.format(sessionDate)
        } catch (e: Exception) {
            "--"
        }
    }

    fun formatSessionAmPm(startTimeSeconds: Long): String {
        return try {
            val sessionDate = Date(startTimeSeconds * 1000)
            val amPmFormat = SimpleDateFormat("a", Locale.getDefault())
            amPmFormat.format(sessionDate)
        } catch (e: Exception) {
            ""
        }
    }

    fun calculateTimeUntil(targetTimeSeconds: Long): Triple<Long, Long, Long> {
        val currentTime = System.currentTimeMillis() / 1000
        val timeUntil = (targetTimeSeconds - currentTime).coerceAtLeast(0)

        val days = timeUntil / 86400
        val hours = (timeUntil % 86400) / 3600
        val minutes = (timeUntil % 3600) / 60

        return Triple(days, hours, minutes)
    }
}
