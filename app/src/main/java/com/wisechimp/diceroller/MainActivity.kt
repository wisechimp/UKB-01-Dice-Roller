package com.wisechimp.diceroller

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var diceViewModel:MainActivityViewModel
    private lateinit var rollingDice:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceViewModel = ViewModelProviders.of(this)[MainActivityViewModel::class.java]
        rollingDice = findViewById(R.id.dice_roll_result_image_view)
        rollingDice.setImageResource(diceViewModel.diceRollValue)
    }

    fun rollDice(view: View) {
        val diceRollResult = diceViewModel.diceRollAttempt()
        Log.i("Roll result", diceRollResult.toString())
        rollingDice.setImageResource(diceRollResult)
    }
}
