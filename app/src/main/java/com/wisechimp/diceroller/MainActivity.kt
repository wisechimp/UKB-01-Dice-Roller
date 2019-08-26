package com.wisechimp.diceroller

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var diceViewModel:MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceViewModel = ViewModelProviders.of(this)[MainActivityViewModel::class.java]
        dice_roll_result_image_view.setImageResource(diceViewModel.diceRollValue)
    }

    fun rollDice(view: View) {
        val diceRollResult = diceViewModel.diceRollAttempt()
        Log.i("Roll result", diceRollResult.toString())
        dice_roll_result_image_view.setImageResource(diceRollResult)
    }
}
