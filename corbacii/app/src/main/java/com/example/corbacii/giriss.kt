package com.example.corbacii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class giriss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giriss)
        var harf1=findViewById<TextView>(R.id.ilk)
        var harf2=findViewById<TextView>(R.id.iki)
        var harf3=findViewById<TextView>(R.id.uc)
        var harf4=findViewById<TextView>(R.id.dort)
        var resim1=findViewById<ImageView>(R.id.tik1)
        var resim2=findViewById<ImageView>(R.id.tik2)
        var resim3=findViewById<ImageView>(R.id.tik3)
        var resim4=findViewById<ImageView>(R.id.tik4)
        var bar =findViewById<ProgressBar>(R.id.progressBar)

        harf1.setOnClickListener {
            if (resim1.visibility == View.INVISIBLE) {
                resim1.visibility = View.VISIBLE
            }
        }
        harf2.setOnClickListener {
            if (resim1.visibility == View.VISIBLE) {
                resim2.visibility = View.VISIBLE
            }
        }
        harf3.setOnClickListener {
            if (resim1.visibility == View.VISIBLE && resim2.visibility == View.VISIBLE) {
                resim3.visibility = View.VISIBLE
            }
        }

        harf4.setOnClickListener {
            if (resim1.visibility == View.VISIBLE && resim2.visibility == View.VISIBLE&& resim3.visibility == View.VISIBLE) {
                resim4.visibility = View.VISIBLE
                bar.visibility=View.VISIBLE
                Handler().postDelayed({
                    var gecis= Intent(this,cesitler:: class.java)
                    startActivity(gecis)
                    finish()
                },2000)
            }
        }
    }
}