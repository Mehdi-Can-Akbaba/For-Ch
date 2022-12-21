package com.example.for_ch

import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class sekiller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekiller)

        val button = findViewById<Button>(R.id.button9)
        val text1 = findViewById<TextView>(R.id.textView2)
        text1.text = "Şekiller"
        val kare = findViewById<ImageView>(R.id.kare)
        kare.visibility = INVISIBLE
        val daire = findViewById<ImageView>(R.id.daire)
        daire.visibility = INVISIBLE
        val kup = findViewById<ImageView>(R.id.cube)
        kup.visibility = INVISIBLE
        val ucgen = findViewById<ImageView>(R.id.ucgen)
        ucgen.visibility = INVISIBLE
        val kalp = findViewById<ImageView>(R.id.kalp)
        kalp.visibility = INVISIBLE
        val yamuk = findViewById<ImageView>(R.id.yamuk)
        yamuk.visibility = INVISIBLE
        val ok = findViewById<ImageView>(R.id.ok)
        ok.visibility = INVISIBLE
        val yıldız = findViewById<ImageView>(R.id.yıldız)
        yıldız.visibility = INVISIBLE

        button.setOnClickListener {

            var i = (1..8).random()

            if (i == 1) {
                text1.text = "Daire"
                daire.visibility = VISIBLE
                kare.visibility = INVISIBLE
                yıldız.visibility = INVISIBLE
                ok.visibility = INVISIBLE
                yamuk.visibility = INVISIBLE
                kalp.visibility = INVISIBLE
                ucgen.visibility = INVISIBLE
                kup.visibility = INVISIBLE


            } else if (i == 2) {
                text1.text = "Kare"
                kare.visibility = VISIBLE
                daire.visibility = INVISIBLE
                yıldız.visibility = INVISIBLE
                ok.visibility = INVISIBLE
                yamuk.visibility = INVISIBLE
                kalp.visibility = INVISIBLE
                ucgen.visibility = INVISIBLE
                kup.visibility = INVISIBLE

            } else if (i == 3) {
                text1.text = "Küp"
                kup.visibility = VISIBLE
                daire.visibility = INVISIBLE
                kare.visibility = INVISIBLE
                yıldız.visibility = INVISIBLE
                ok.visibility = INVISIBLE
                yamuk.visibility = INVISIBLE
                kalp.visibility = INVISIBLE
                ucgen.visibility = INVISIBLE

            } else if (i == 4) {
                text1.text = "Üçgen"
                ucgen.visibility = VISIBLE
                daire.visibility = INVISIBLE
                kare.visibility = INVISIBLE
                yıldız.visibility = INVISIBLE
                ok.visibility = INVISIBLE
                yamuk.visibility = INVISIBLE
                kalp.visibility = INVISIBLE
                kup.visibility = INVISIBLE

            } else if (i == 5) {
                text1.text = "Kalp"
                kalp.visibility = VISIBLE
                daire.visibility = INVISIBLE
                kare.visibility = INVISIBLE
                yıldız.visibility = INVISIBLE
                ok.visibility = INVISIBLE
                yamuk.visibility = INVISIBLE
                ucgen.visibility = INVISIBLE
                kup.visibility = INVISIBLE

            } else if (i == 6) {
                text1.text = "Yamuk"
                yamuk.visibility = VISIBLE
                daire.visibility = INVISIBLE
                kare.visibility = INVISIBLE
                yıldız.visibility = INVISIBLE
                ok.visibility = INVISIBLE
                kalp.visibility = INVISIBLE
                ucgen.visibility = INVISIBLE
                kup.visibility = INVISIBLE

            } else if (i == 7) {
                text1.text = "Ok"
                ok.visibility = VISIBLE
                daire.visibility = INVISIBLE
                kare.visibility = INVISIBLE
                yıldız.visibility = INVISIBLE
                yamuk.visibility = INVISIBLE
                kalp.visibility = INVISIBLE
                ucgen.visibility = INVISIBLE
                kup.visibility = INVISIBLE

            } else if (i == 8) {
                text1.text = "Yıldız"
                yıldız.visibility = VISIBLE
                daire.visibility = INVISIBLE
                kare.visibility = INVISIBLE
                ok.visibility = INVISIBLE
                yamuk.visibility = INVISIBLE
                kalp.visibility = INVISIBLE
                ucgen.visibility = INVISIBLE
                kup.visibility = INVISIBLE

            }
        }
    }
}
