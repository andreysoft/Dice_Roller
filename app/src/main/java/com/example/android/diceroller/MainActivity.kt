package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.android.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.time.Duration

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val rollButton: Button = findViewById(R.id.roll_button)

        binding.rollButton.setText(R.string.roll1)

        binding.rollButton.setOnClickListener {
            //Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show()
            rollDice()
        }


    }

    private fun rollDice() {
        binding.resultText.setText(Random.nextInt(1,7).toString())

    }
}
