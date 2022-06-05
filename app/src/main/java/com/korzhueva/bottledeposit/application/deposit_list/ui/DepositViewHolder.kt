package com.korzhueva.bottledeposit.application.deposit_list.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.korzhueva.bottledeposit.R
import com.korzhueva.bottledeposit.application.core.ui.QuantityBottomPanelView

class DepositViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {
    private val tvName: TextView = itemView.findViewById(R.id.tvName)
    private val vQuantityBottomPanelView: QuantityBottomPanelView =
        itemView.findViewById(R.id.vQuantityBottomPanel)

    fun bind() {
        vQuantityBottomPanelView.apply {
            setDownAction { }
            setUpAction { }
        }
    }
}