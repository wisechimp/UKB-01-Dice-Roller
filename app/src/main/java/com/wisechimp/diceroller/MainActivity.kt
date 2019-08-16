package com.wisechimp.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rollDice(view: View) {
        val randomInt = Random.nextInt(6) +1
        dice_roll_result_text_view.text = randomInt.toString()
        Toast.makeText(this, "Rolled 'em", Toast.LENGTH_SHORT).show()
    }
}
