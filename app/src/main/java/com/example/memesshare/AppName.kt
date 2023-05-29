package com.example.memesshare

import android.app.Application
import com.google.android.material.color.DynamicColors

class AppName : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}