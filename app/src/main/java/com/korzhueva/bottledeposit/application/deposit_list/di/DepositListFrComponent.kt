package com.korzhueva.bottledeposit.application.deposit_list.di

import com.korzhueva.bottledeposit.application.deposit_list.ui.DepositListFragment
import dagger.Subcomponent

@Subcomponent
interface DepositListFrComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): DepositListFrComponent
    }

    fun inject(fragment: DepositListFragment)
}