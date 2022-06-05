package com.korzhueva.bottledeposit.application.core.di

import com.korzhueva.bottledeposit.application.DepositActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent {
    fun inject(activity: DepositActivity)
}