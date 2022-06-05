package com.korzhueva.bottledeposit.application.core.di

import com.korzhueva.bottledeposit.application.DepositActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface DepositActComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): DepositActComponent
    }

    fun inject(loginActivity: DepositActivity)
}