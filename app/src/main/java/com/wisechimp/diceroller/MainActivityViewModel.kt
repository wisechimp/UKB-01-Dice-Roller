package com.wisechimp.diceroller

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import kotlin.random.Random

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    var diceRollValue = R.drawable.empty_dice

    fun diceRollAttempt (): Int {
        val randomInt = Random.nextInt(6) + 1
        diceRollValue = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return diceRollValue
    }
}