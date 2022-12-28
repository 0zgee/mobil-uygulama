package com.example.corbacii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.toast.view.*

class cesitler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cesitler)
        var buton = findViewById<Button>(R.id.button)
        var ch = findViewById<CheckBox>(R.id.checkBox)
        var rg = findViewById<RadioGroup>(R.id.radioGroup)
        var rb1 = findViewById<RadioButton>(R.id.radioButton)
        var rb2 = findViewById<RadioButton>(R.id.radioButton2)
        var rb3 = findViewById<RadioButton>(R.id.radioButton3)
        var rb4 = findViewById<RadioButton>(R.id.radioButton4)
        var rb5 = findViewById<RadioButton>(R.id.radioButton5)
        var rb6 = findViewById<RadioButton>(R.id.radioButton6)
        var rb7 = findViewById<RadioButton>(R.id.radioButton7)
        var rb8 = findViewById<RadioButton>(R.id.radioButton8)
        var rb9 = findViewById<RadioButton>(R.id.radioButton9)
        var rb10 = findViewById<RadioButton>(R.id.radioButton10)
        var rb11 = findViewById<RadioButton>(R.id.radioButton11)
        var rb12 = findViewById<RadioButton>(R.id.radioButton12)
        //var tasarim = layoutInflater.inflate(R.layout.toast, null)
        //var toasyazi = tasarim.findViewById<TextView>(R.id.toas)

        var veri=""

        var a= 0
        rb1.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Ezogelin Çorbası"
                    a = 1



            }
        }
        rb2.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Düğün Çorbası"
                    a = 1



            }
        }
        rb3.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Mercimek Çorbası"
                    a = 1



            }
        }
        rb4.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Brokoli Çorbası"
                    a = 1



            }
        }
        rb5.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Kelle_paça Çorbası"
                    a = 1


            }
        }
        rb6.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Yayla Çorbası"
                    a = 1



            }
        }
        rb7.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Şehriye Çorbası"
                    a = 1



            }
        }
        rb8.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Domates Çorbası"
                    a = 1



            }
        }
        rb9.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Tarhana Çorbası"
                    a = 1



            }
        }
        rb10.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Mantar Çorbası"
                    a = 1



            }
        }
        rb11.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="İşkembe Çorbası"
                    a = 1



            }
        }
        rb12.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {

                    veri="Tavuk Çorbası"
                    a = 1



            }
        }
        rg.visibility = View.INVISIBLE
        buton.visibility = View.INVISIBLE
        ch.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                rg.visibility = View.VISIBLE
                buton.visibility = View.VISIBLE
            } else {
                rg.visibility = View.INVISIBLE
                buton.visibility = View.INVISIBLE
            }
        }
        buton.setOnClickListener {
            if (a == 1) {

                val duzen = layoutInflater.inflate(R.layout.toast, null)
                val ozeltoast = Toast(applicationContext)
                var yazi = duzen.toas
                ozeltoast.view=duzen
                yazi.text="${veri} Güzel Seçim Lütfen Bekleyiniz"
                ozeltoast.duration=Toast.LENGTH_LONG
                ozeltoast.setGravity(Gravity.BOTTOM, 0,0)
                ozeltoast.show()

                object : CountDownTimer(3000,1000){
                    override fun onTick(p0: Long) {

                    }

                    override fun onFinish() {

                        var gecis = Intent(applicationContext, icerik::class.java)
                        gecis.putExtra("aktar", veri)
                        startActivity(gecis)
                        finish()

                    }

                }.start()


            }else{

                val uyari = AlertDialog.Builder(this)
                uyari.setTitle("Uyarı!")
                uyari.setMessage("Lütfen seçim yapınız")
                uyari.setIcon(R.drawable.amblem)

                uyari.setNeutralButton("TEKRAR DENE") { DialogInterface, i ->

                }
                uyari.create().show()

            }
        }

    }
}
