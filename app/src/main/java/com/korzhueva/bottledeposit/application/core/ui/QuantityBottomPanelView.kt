package com.korzhueva.bottledeposit.application.core.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton
import com.korzhueva.bottledeposit.R

class QuantityBottomPanelView : LinearLayout {
    private lateinit var btnDown: AppCompatImageButton
    private lateinit var btnUp: AppCompatImageButton

    constructor(context: Context?) : super(context) {
        setUI()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        setUI()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        setUI()
    }

    private fun setUI() {
        val view = inflate(context, R.layout.deposit_bottom_panel, this)
        btnDown = view.findViewById(R.id.btnDown)
        btnUp = view.findViewById(R.id.btnUp)
    }

    fun setDownAction(action: () -> Unit){
        btnDown.setOnClickListener {
            action.invoke()
        }
    }

    fun setUpAction(action: () -> Unit){
        btnUp.setOnClickListener {
            action.invoke()
        }
    }
}