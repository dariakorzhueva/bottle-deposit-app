package com.korzhueva.bottledeposit.application

import android.app.Application
import com.korzhueva.bottledeposit.application.core.di.ApplicationComponent
import com.korzhueva.bottledeposit.application.core.di.DaggerApplicationComponent

class DepositApplication : Application() {
    private lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        val appComponent = DaggerApplicationComponent.create()
    }

    fun getAppComponent(): ApplicationComponent {
        return appComponent
    }
}