package com.example.corbacii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class icerik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icerik)
        var seek = findViewById<SeekBar>(R.id.seekBar2)
        var seek2 = findViewById<SeekBar>(R.id.seekBar3)

        val intent = intent
        var yaz = findViewById<TextView>(R.id.textView10)
        var text = intent.getStringExtra("aktar")
        yaz.text = text

        var buton2 = findViewById<Button>(R.id.button3)

        seek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 2) {
                    var uyari = AlertDialog.Builder(this@icerik)
                    uyari.setTitle("Uyarı!")
                    uyari.setMessage("Bu kadar tuzlu istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.tuz)
                    uyari.setPositiveButton("Evet") { DialogInterface, i ->
                        Toast.makeText(applicationContext, "Bol Tuzlu Çorba", Toast.LENGTH_SHORT)
                            .show()
                    }
                    uyari.setNegativeButton("Hayır") { DialogInterface, i ->
                        seek.progress = 1
                    }
                    uyari.create().show()

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
        seek2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                if (p1 == 2) {
                    var uyari = AlertDialog.Builder(this@icerik)
                    uyari.setTitle("Uyarı!")
                    uyari.setMessage("Bu kadar acı istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.biber)
                    uyari.setPositiveButton("Evet") { DialogInterface, i ->
                        Toast.makeText(this@icerik, "Bol Acılı Çorba", Toast.LENGTH_LONG).show()
                    }
                    uyari.setNegativeButton("Hayır") { DialogInterface, i ->
                        seek2.progress = 1
                    }
                    uyari.create().show()

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        var sarimsak = findViewById<Switch>(R.id.sarimsak)
        var nane = findViewById<Switch>(R.id.nane)
        var dil = findViewById<Switch>(R.id.dil)
        var terbiye = findViewById<Switch>(R.id.terbiye)
        var sirke = findViewById<Switch>(R.id.sirke)
        var krema = findViewById<Switch>(R.id.krema)
        var yag = findViewById<Switch>(R.id.yag)
        var kasar = findViewById<Switch>(R.id.kasar)
        var kitir = findViewById<Switch>(R.id.kitir)
        var limon = findViewById<Switch>(R.id.limon)
        var biber = findViewById<Switch>(R.id.tozbiber)
        var beyin = findViewById<Switch>(R.id.beyin)
        var extra = findViewById<EditText>(R.id.ek)

        if (text == "Ezogelin Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (text == "Düğün Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE


        }
        if (text == "Mercimek Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (text == "Brokoli Çorbası") {
            krema.visibility = View.VISIBLE


        }
        if (text == "Kelle_paça Çorbası") {
            dil.visibility = View.VISIBLE
            sarimsak.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE


        }
        if (text == "Yayla Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (text == "Şehriye Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (text == "Domates Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kasar.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            terbiye.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (text == "Tarhana Çorbası") {
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (text == "Mantar Çorbası") {
            kasar.visibility = View.VISIBLE

        }
        if (text == "İşkembe Çorbası") {
            sarimsak.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (text == "Tavuk Çorbası") {
            krema.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE

        }


        buton2.setOnClickListener {
            var sipariss = yaz.text.toString()
            var tuzmiktari = seek.progress.toString()
            var acımiktari = seek2.progress.toString()
            var sarimsakmiktari = sarimsak.isChecked.toString()
            var nanemiktari = nane.isChecked.toString()
            var dilmiktari = dil.isChecked.toString()
            var terbiyemiktari = terbiye.isChecked.toString()
            var sirkemiktari = sirke.isChecked.toString()
            var kremamiktari = krema.isChecked.toString()
            var yagmiktari = yag.isChecked.toString()
            var kasarmiktari = kasar.isChecked.toString()
            var kitirmiktari = kitir.isChecked.toString()
            var limonmiktari = limon.isChecked.toString()
            var bibermiktari = biber.isChecked.toString()
            var beyinmiktari = beyin.isChecked.toString()
            var extraistek = extra.text.toString()


            val uyar = AlertDialog.Builder(this)
            uyar.setTitle("Uyarı!")
            uyar.setMessage("Sparişiniz Hazırlanacak. Devam Etmek İstiyor musunuz?")
            uyar.setIcon(R.drawable.amblem)

            uyar.setNeutralButton("TEKRAR KONTROL ETMEK İSTİYORUM") { DialogInterface, i ->

            }
            uyar.setPositiveButton("EVET") { DialogInterface, i ->
                Handler().postDelayed({
                    var gecis = Intent(applicationContext, siparis::class.java)
                    gecis.putExtra("siparis", sipariss)
                    gecis.putExtra("tuzmiktari", tuzmiktari)
                    gecis.putExtra("acımiktari", acımiktari)
                    gecis.putExtra("sarimsakmiktari", sarimsakmiktari)
                    gecis.putExtra("nanemiktari", nanemiktari)
                    gecis.putExtra("dilmiktari", dilmiktari)
                    gecis.putExtra("terbiyemiktari", terbiyemiktari)
                    gecis.putExtra("sirkemiktari", sirkemiktari)
                    gecis.putExtra("kremamiktari", kremamiktari)
                    gecis.putExtra("yagmiktari", yagmiktari)
                    gecis.putExtra("kasarmiktari", kasarmiktari)
                    gecis.putExtra("kitirmiktari", kitirmiktari)
                    gecis.putExtra("limonmiktari", limonmiktari)
                    gecis.putExtra("bibermiktari", bibermiktari)
                    gecis.putExtra("beyinmiktari", beyinmiktari)
                    gecis.putExtra("extraistek", extraistek)
                    startActivity(gecis)
                    finish()
                }, 2000)
            }
            uyar.create().show()

        }


    }
}