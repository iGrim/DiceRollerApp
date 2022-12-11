package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener {
            diceRoll()

        }
    }
    private fun diceRoll() {
        var randomNo = (1..6).random()
        var imageDice :Int
        if(randomNo == 1){
            imageDice = R.drawable.dice_1
        }
        else if(randomNo == 2){
            imageDice = R.drawable.dice_2
        }
        else if(randomNo == 3){
            imageDice = R.drawable.dice_3
        }
        else if(randomNo == 4){
            imageDice = R.drawable.dice_4
        }
        else if(randomNo == 5){
            imageDice = R.drawable.dice_5
        }
        else {
            imageDice = R.drawable.dice_6
        }
        dice_image.setImageResource(imageDice)

        Toast.makeText(this, "Dice rolled.", Toast.LENGTH_SHORT).show()
    }
}