package com.korzhueva.bottledeposit.application

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.korzhueva.bottledeposit.R
import com.korzhueva.bottledeposit.application.deposit_list.ui.DepositListFragment

class DepositActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deposit)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flContainer, DepositListFragment.newInstance(), DepositListFragment.TAG)
    }
}