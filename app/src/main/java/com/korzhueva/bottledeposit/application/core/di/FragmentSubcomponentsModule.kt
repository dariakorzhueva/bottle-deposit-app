package com.korzhueva.bottledeposit.application.core.di

import com.korzhueva.bottledeposit.application.deposit_list.di.DepositListFrComponent
import dagger.Module

@Module(subcomponents = [DepositListFrComponent::class])
class FragmentSubcomponentsModule