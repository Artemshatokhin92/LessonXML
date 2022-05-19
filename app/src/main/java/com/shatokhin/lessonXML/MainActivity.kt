package com.shatokhin.lessonXML

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val btnTelegramConstraintLayout: Button by lazy { findViewById(R.id.btnTelegramConstraintLayout) }
    private val btnTelegramOtherLayout: Button by lazy { findViewById(R.id.btnTelegramOtherLayout) }
    private val btnMusicPlayerConstraintLayout: Button by lazy { findViewById(R.id.btnMusicPlayerConstraintLayout) }
    private val btnMusicPlayerOtherLayout: Button by lazy { findViewById(R.id.btnMusicPlayerOtherLayout) }
    private val btnCalculatorConstraintLayout: Button by lazy { findViewById(R.id.btnCalculatorConstraintLayout) }
    private val btnCalculatorOtherLayout: Button by lazy { findViewById(R.id.btnCalculatorOtherLayout) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTelegramConstraintLayout.setOnClickListener {
            val intent = Intent(this, TelegramConstraintLayout::class.java)
            startActivity(intent)
        }

        btnTelegramOtherLayout.setOnClickListener {
            val intent = Intent(this, TelegramOtherLayout::class.java)
            startActivity(intent)
        }

        btnMusicPlayerConstraintLayout.setOnClickListener {
            val intent = Intent(this, MusicPlayerConstraintLayout::class.java)
            startActivity(intent)
        }

        btnMusicPlayerOtherLayout.setOnClickListener {
            val intent = Intent(this, MusicPlayerOtherLayout::class.java)
            startActivity(intent)
        }

        btnCalculatorConstraintLayout.setOnClickListener {
            val intent = Intent(this, CalculatorConstraintLayout::class.java)
            startActivity(intent)
        }

        btnCalculatorOtherLayout.setOnClickListener {
            val intent = Intent(this, CalculatorOtherLayout::class.java)
            startActivity(intent)
        }



    }
}