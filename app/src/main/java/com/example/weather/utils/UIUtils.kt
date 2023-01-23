package com.example.weather.utils

import android.content.Context
import android.widget.Toast
import java.time.Duration

fun Context.toast(message: String, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, duration).show()
}