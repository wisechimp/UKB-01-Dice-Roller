package com.wisechimp.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun rollDice(view: View) {
        Toast.makeText(this, "Rolled 'em", Toast.LENGTH_SHORT).show()
    }
}
