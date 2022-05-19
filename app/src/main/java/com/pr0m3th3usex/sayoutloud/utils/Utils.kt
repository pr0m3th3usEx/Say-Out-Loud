package com.pr0m3th3usex.sayoutloud.utils

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.String.format
import java.time.*
import java.time.ZoneOffset.UTC
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.String

object String {
    @SuppressLint("DefaultLocale")
    fun formatTime(time: Long, pattern: String): kotlin.String? {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val localDateTime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault())
            val formatter = DateTimeFormatter.ofPattern(pattern.toString(), Locale.getDefault())

            return localDateTime.format(formatter)
        } else {
            return format("%02d:%02d", (time / 1000) / 60, (time / 1000) % 60);
        }
    }
}

