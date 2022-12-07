package com.example.for_ch
import android.content.Intent
import android.graphics.Color
import android.graphics.fonts.Font
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Hayvanlar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hayvanlar)

            val buttonHa = findViewById<Button>(R.id.button23)
            buttonHa.visibility = INVISIBLE
            val buttonBa = findViewById<Button>(R.id.bastan)
            buttonBa.visibility = VISIBLE
            val buttonAna =findViewById<Button>(R.id.buttonAna)
            buttonAna.visibility= INVISIBLE
            val buttonBa2=findViewById<Button>(R.id.start13)
            buttonBa2.visibility= INVISIBLE
            val metin = findViewById<TextView>(R.id.textView4)
            val fil = findViewById<ImageView>(R.id.fil)
            fil.visibility = INVISIBLE
            val arı = findViewById<ImageView>(R.id.ari)
            arı.visibility = INVISIBLE
            val kedi = findViewById<ImageView>(R.id.kedi)
            kedi.visibility = INVISIBLE
            val kopek = findViewById<ImageView>(R.id.kopek)
            kopek.visibility = INVISIBLE
            val flamingo = findViewById<ImageView>(R.id.flamingo)
            flamingo.visibility = INVISIBLE
            val maymun = findViewById<ImageView>(R.id.maymun)
            maymun.visibility = INVISIBLE
            val sincap = findViewById<ImageView>(R.id.sincap)
            sincap.visibility = INVISIBLE
            val papagan = findViewById<ImageView>(R.id.papagan)
            papagan.visibility = INVISIBLE
            val kaplumbaga = findViewById<ImageView>(R.id.kurbağa)
            kaplumbaga.visibility = INVISIBLE
            val tavuk = findViewById<ImageView>(R.id.tavuk)
            tavuk.visibility = INVISIBLE
            val inek = findViewById<ImageView>(R.id.inek)
            inek.visibility = INVISIBLE

            fun animals() {
                buttonBa.visibility= INVISIBLE
                buttonHa.visibility= VISIBLE
                buttonHa.text="Başla"
                buttonHa.setTextColor(Color.parseColor("#FFFF00"))
                buttonHa.setBackgroundColor(Color.parseColor("#000000"))
                buttonAna.visibility= INVISIBLE
                metin.visibility= VISIBLE

                buttonHa.setOnClickListener {
                    fil.visibility = VISIBLE
                    buttonHa.visibility= INVISIBLE
                    buttonBa2.visibility= VISIBLE
                    buttonBa2.text = "Fil"
                    buttonBa2.setTextColor(Color.parseColor("#000000"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#FFFF00"))
                    metin.visibility = INVISIBLE
                }
                fil.setOnClickListener {
                    fil.visibility = INVISIBLE
                    buttonBa2.text = "Arı"
                    buttonBa2.setTextColor(Color.parseColor("#FFFFFF"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#000000"))
                    arı.visibility = VISIBLE
                }
                arı.setOnClickListener {
                    arı.visibility = INVISIBLE
                    buttonBa2.text = "Kedi"
                    buttonBa2.setTextColor(Color.parseColor("#FF0000"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#9ACD32"))
                    kedi.visibility = VISIBLE
                }
                kedi.setOnClickListener {
                    kedi.visibility = INVISIBLE
                    buttonBa2.text = "Köpek"
                    buttonBa2.setTextColor(Color.parseColor("#1E90FF"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#00FF00"))
                    kopek.visibility = VISIBLE
                }
                kopek.setOnClickListener {
                    kopek.visibility = INVISIBLE
                    buttonBa2.text = "Flamingo"
                    buttonBa2.setTextColor(Color.parseColor("#000000"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#FF69B4"))
                    flamingo.visibility = VISIBLE
                }
                flamingo.setOnClickListener {
                    flamingo.visibility = INVISIBLE
                    buttonBa2.text = "Maymun"
                    buttonBa2.setTextColor(Color.parseColor("#FFFFFF"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#FF7F00"))
                    maymun.visibility = VISIBLE
                }
                maymun.setOnClickListener {
                    maymun.visibility = INVISIBLE
                    buttonBa2.text = "Sincap"
                    buttonBa2.setTextColor(Color.parseColor("#000000"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#1DA2F2"))
                    sincap.visibility = VISIBLE
                }
                sincap.setOnClickListener {
                    sincap.visibility = INVISIBLE
                    buttonBa2.text = "Papağan"
                    buttonBa2.setTextColor(Color.parseColor("#FF00FF"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#FFD002"))
                    papagan.visibility = VISIBLE
                }
                papagan.setOnClickListener {
                    papagan.visibility = INVISIBLE
                    buttonBa2.text = "Kurbağa"
                    buttonBa2.setTextColor(Color.parseColor("#1E90FF"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#000000"))
                    kaplumbaga.visibility = VISIBLE
                }
                kaplumbaga.setOnClickListener {
                    kaplumbaga.visibility = INVISIBLE
                    buttonBa2.text = "Tavuk"
                    buttonBa2.setTextColor(Color.parseColor("#00FF00"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#DA70D6"))
                    tavuk.visibility = VISIBLE
                }
                tavuk.setOnClickListener {
                    tavuk.visibility = INVISIBLE
                    buttonBa2.text = "İnek"
                    inek.visibility= VISIBLE
                    buttonBa2.setTextColor(Color.parseColor("#000000"))
                    buttonBa2.setBackgroundColor(Color.parseColor("#FFFF00"))
                }
                inek.setOnClickListener{
                    inek.visibility= INVISIBLE
                    buttonBa2.visibility= INVISIBLE
                    buttonAna.visibility= VISIBLE
                    buttonBa.visibility= VISIBLE
                }
            }

        buttonBa.setOnClickListener {animals()}

        buttonAna.setOnClickListener {
           val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}