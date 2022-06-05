package com.korzhueva.bottledeposit.application.core.di

import com.korzhueva.bottledeposit.application.DepositActivity
import com.korzhueva.bottledeposit.application.deposit_list.di.DepositListFrComponent
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [FragmentSubcomponentsModule::class]
)
interface DepositActComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): DepositActComponent
    }

    fun inject(activity: DepositActivity)

    fun depositListFrComponent(): DepositListFrComponent.Factory
}