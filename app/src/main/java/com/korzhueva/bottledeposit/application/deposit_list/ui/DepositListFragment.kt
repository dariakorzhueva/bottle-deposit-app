package com.korzhueva.bottledeposit.application.deposit_list.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.korzhueva.bottledeposit.R

class DepositListFragment : Fragment() {
    private lateinit var rvDeposits: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_deposit_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvDeposits = view.findViewById(R.id.rvDeposits)
    }

    companion object {
        val TAG: String = DepositListFragment::class.java.canonicalName
            ?: DepositListFragment::class.java.simpleName

        fun newInstance(): DepositListFragment = DepositListFragment()
    }
}