package com.korzhueva.bottledeposit.application.deposit_list.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.korzhueva.bottledeposit.R

class DepositListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var deposits: MutableList<DepositItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.deposit_item_row, parent, false)

        return DepositViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val deposit = deposits[position]
        when (holder) {
            is DepositViewHolder -> holder.bind(deposit)
        }
    }

    override fun getItemCount(): Int {
        return deposits.size
    }

    fun setDeposits(deposits: List<DepositItem>) {
        this.deposits = deposits.toMutableList()
        notifyDataSetChanged()
    }
}