package com.example.corbacii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var corbaci = findViewById<TextView>(R.id.corbaci)
        object : CountDownTimer(3000,60){
            var a=1
            override fun onTick(p0: Long) {
                corbaci.setTextSize(a.toFloat())
                a = a + 1
            }
            override fun onFinish() {

                var gecis= Intent(applicationContext,giriss::class.java)
                startActivity(gecis)
                finish()
            }
        }.start()
    }
}