package com.sahalnazar.formula1.util

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.net.toUri

object UrlUtils {
    fun openUrl(context: Context, url: String) {

        runCatching {
            val intent = Intent(Intent.ACTION_VIEW, url.toUri())
            if (context !is android.app.Activity) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)

        }.onFailure { exception ->
            Toast.makeText(
                context,
                "Couldn't open link. Please ensure you have a browser installed.",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
