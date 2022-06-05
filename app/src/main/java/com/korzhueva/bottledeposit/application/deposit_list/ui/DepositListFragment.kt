package com.korzhueva.bottledeposit.application.deposit_list.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.korzhueva.bottledeposit.R
import com.korzhueva.bottledeposit.application.DepositApplication
import com.korzhueva.bottledeposit.application.deposit_list.di.DepositListFrComponent
import javax.inject.Inject

class DepositListFragment : Fragment() {
    @Inject
    lateinit var depositListAdapter: DepositListAdapter

    private lateinit var depositListFrComponent: DepositListFrComponent
    private lateinit var rvDeposits: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        depositListFrComponent = (activity?.applicationContext as DepositApplication)
            .getAppComponent().depositActComponent().create().depositListFrComponent().create()

        depositListFrComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

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

        initList()
    }

    private fun initList() {
        rvDeposits.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = depositListAdapter
        }
        depositListAdapter.setDeposits(
            listOf(
                DepositItem(
                    id = "123",
                    name = "Test"
                )
            )
        )
    }

    companion object {
        val TAG: String = DepositListFragment::class.java.canonicalName
            ?: DepositListFragment::class.java.simpleName

        fun newInstance(): DepositListFragment = DepositListFragment()
    }
}