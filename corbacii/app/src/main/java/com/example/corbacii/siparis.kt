package com.example.corbacii

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class siparis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siparis)

        var durum=findViewById<TextView>(R.id.textView8)
        var icinde=findViewById<TextView>(R.id.textView12)
        var ic=findViewById<TextView>(R.id.textView11)
        var olsun=findViewById<TextView>(R.id.textView13)
        var extra=findViewById<TextView>(R.id.textView15)
        var yeni=findViewById<TextView>(R.id.textView2)
        var carpi=findViewById<ImageView>(R.id.imageView10)

        val intent=intent
        var corbaa = intent.getStringExtra("siparis")
        var tuz = intent.getStringExtra("tuzmiktari")
        var aci= intent.getStringExtra("acımiktari")
        var nane = intent.getStringExtra("nanemiktari")
        var dil = intent.getStringExtra("dilmiktari")
        var terbiye = intent.getStringExtra("terbiyemiktari")
        var sirke = intent.getStringExtra("sirkemiktari")
        var krema = intent.getStringExtra("kremamiktari")
        var yag = intent.getStringExtra("yagmiktari")
        var kasar = intent.getStringExtra("kasarmiktari")
        var kitir = intent.getStringExtra("kitirmiktari")
        var limon= intent.getStringExtra("limonmiktari")
        var biber = intent.getStringExtra("bibermiktari")
        var beyin = intent.getStringExtra("beyinmiktari")
        var sarimsak=intent.getStringExtra("sarimsakmiktari")
        var extraistek = intent.getStringExtra("extraistek")

        yeni.setTextColor(Color.WHITE)


        if(aci=="0"){
            aci="Acısız"
        }else if(aci=="1"){
            aci=" Orta Acılı"
        }else{
            aci=" Bol Acılı"
        }
        if(tuz=="0"){
            tuz="Tuzsuz"
        }else if(tuz=="1"){
            tuz=" Orta Tuzlu"
        }else{
            tuz=" Bol Tuzlu"
        }

        durum.text="Bir ${corbaa} Çeeek,${tuz} ve ${aci} olsun"
        var a=0
        if(nane=="true"){
            nane="nane,"
            a=1
        }else{
            nane=""
        }
        if(dil=="true"){
            dil="dil,"
            a=1
        }else{
            dil=""
        }
        if(terbiye=="true"){
            terbiye="terbiye,"
            a=1
        }else{
            terbiye=""
        }
        if(sirke=="true"){
            sirke="sirke,"
            a=1
        }else{
            sirke=""
        }
        if(krema=="true"){
            krema="krema,"
            a=1
        }else{
            krema=" "
        }
        if(kitir=="true"){
            kitir="kitir,"
            a=1
        }else{
            kitir=" "
        }
        if(limon=="true"){
            limon="limon,"
            a=1
        }else{
            limon=""
        }
        if(biber=="true"){
            biber=" toz biber,"
            a=1
        }else{
            biber=""
        }
        if(beyin=="true"){
            beyin="beyin,"
            a=1
        }else{
            beyin=""
        }
        if(yag=="true"){
            yag="yag,"
            a=1
        }else{
            yag=""
        }
        if(sarimsak=="true"){
            sarimsak="sarimsak,"
            a=1
        }else{
            sarimsak=""
        }
        if(kasar=="true"){
            kasar="kasar,"
            a=1
        }else{
            kasar=""
        }
        if(a==0){
            ic.visibility= View.INVISIBLE
            olsun.visibility=View.INVISIBLE
        }
        icinde.text=" ${sarimsak} ${nane} ${dil} ${terbiye} ${sirke} ${krema} ${kitir} ${limon} ${biber} ${beyin} ${yag} ${kasar}"

        if(extraistek==""){
            extra.text =""
        }else {
            extra.text = "Extra İSTEK: ${extraistek}"
        }
        yeni.setOnClickListener {
            Handler().postDelayed({
                var gecis = Intent(applicationContext, cesitler::class.java)
                startActivity(gecis)
                finish()
            }, 500)
        }
        carpi.setOnClickListener {
            val uyari = AlertDialog.Builder(this@siparis)
            uyari.setTitle("Çıkış")
            uyari.setMessage("Çıkmak İstediğinize Emin misiniz?")
            uyari.setIcon(R.drawable.carpi)
            uyari.setNegativeButton("HAYIR"){ DialogInterface, i ->

            }
            uyari.setPositiveButton("EVET") { DialogInterface, i ->
                System.exit(0)
            }
            uyari.create().show()
        }
        var c =1
        var b =0
        object : CountDownTimer(8000,500){

            override fun onTick(p0: Long) {
                if (b==c) {
                    yeni.setTextColor(Color.WHITE)
                    c = c+1
                } else {
                    yeni.setTextColor(Color.BLACK)
                    b = b+1
                }
            }
            override fun onFinish() {

            }
        }.start()




    }
    }
