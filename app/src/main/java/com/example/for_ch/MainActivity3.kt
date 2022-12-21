package com.example.for_ch

import android.content.Intent
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val buttonRa= findViewById<Button>(R.id.button10)
        buttonRa.text= "RAKAMLAR"
        val text1 = findViewById<TextView>(R.id.textView3)
        text1.visibility= INVISIBLE

        val buttonRa1= findViewById<Button>(R.id.button11)
        buttonRa1.visibility= INVISIBLE
        val buttonRa2= findViewById<Button>(R.id.button12)
        buttonRa2.visibility= INVISIBLE
        val buttonRa3= findViewById<Button>(R.id.button13)
        buttonRa3.visibility= INVISIBLE
        val buttonRa4= findViewById<Button>(R.id.button14)
        buttonRa4.visibility= INVISIBLE
        val buttonRa5= findViewById<Button>(R.id.button15)
        buttonRa5.visibility= INVISIBLE
        val buttonRa6= findViewById<Button>(R.id.button16)
        buttonRa6.visibility= INVISIBLE
        val buttonRa7= findViewById<Button>(R.id.button17)
        buttonRa7.visibility= INVISIBLE
        val buttonRa8= findViewById<Button>(R.id.button18)
        buttonRa8.visibility= INVISIBLE
        val buttonRa9= findViewById<Button>(R.id.button19)
        buttonRa9.visibility= INVISIBLE
        val buttonRa10=findViewById<Button>(R.id.button20)
        buttonRa10.visibility= INVISIBLE
        val buttonA=findViewById<Button>(R.id.button21)
        buttonA.visibility= INVISIBLE

        val bir = findViewById<ImageView>(R.id.bir)
        bir.visibility= INVISIBLE
        val iki = findViewById<ImageView>(R.id.iki)
        iki.visibility= INVISIBLE
        val üç = findViewById<ImageView>(R.id.uc)
        üç.visibility= INVISIBLE
        val dört = findViewById<ImageView>(R.id.dort)
        dört.visibility= INVISIBLE
        val beş = findViewById<ImageView>(R.id.bes)
        beş.visibility= INVISIBLE
        val altı = findViewById<ImageView>(R.id.altı)
        altı.visibility= INVISIBLE
        val yedi = findViewById<ImageView>(R.id.yedi)
        yedi.visibility= INVISIBLE
        val sekiz = findViewById<ImageView>(R.id.sekiz)
        sekiz.visibility= INVISIBLE
        val dokuz = findViewById<ImageView>(R.id.dokuz)
        dokuz.visibility= INVISIBLE
        val sıfır = findViewById<ImageView>(R.id.sfr)
        sıfır.visibility= INVISIBLE

       fun buttonC(){


               text1.visibility= VISIBLE
               text1.text = "Sıfır"
               sıfır.visibility = VISIBLE
               buttonRa.visibility = INVISIBLE
               buttonRa1.visibility = VISIBLE

           buttonRa1.setOnClickListener {
               text1.text = "Bir"
               bir.visibility = VISIBLE
               sıfır.visibility = INVISIBLE
               buttonRa1.visibility = INVISIBLE
               buttonRa2.visibility = VISIBLE
           }
           buttonRa2.setOnClickListener {
               text1.text = "İki"
               bir.visibility = INVISIBLE
               iki.visibility = VISIBLE
               buttonRa2.visibility = INVISIBLE
               buttonRa3.visibility = VISIBLE
           }
           buttonRa3.setOnClickListener {
               text1.text = "Üç"
               üç.visibility = VISIBLE
               iki.visibility = INVISIBLE
               buttonRa3.visibility = INVISIBLE
               buttonRa4.visibility = VISIBLE
           }
           buttonRa4.setOnClickListener {
               text1.text = "Dört"
               dört.visibility = VISIBLE
               üç.visibility = INVISIBLE
               buttonRa4.visibility = INVISIBLE
               buttonRa5.visibility = VISIBLE
           }
           buttonRa5.setOnClickListener {
               text1.text = "Beş"
               beş.visibility = VISIBLE
               dört.visibility = INVISIBLE
               buttonRa5.visibility = INVISIBLE
               buttonRa6.visibility = VISIBLE
           }
           buttonRa6.setOnClickListener {
               text1.text = "Altı"
               altı.visibility = VISIBLE
               beş.visibility = INVISIBLE
               buttonRa6.visibility = INVISIBLE
               buttonRa7.visibility = VISIBLE
           }
           buttonRa7.setOnClickListener {
               text1.text = "Yedi"
               yedi.visibility = VISIBLE
               altı.visibility = INVISIBLE
               buttonRa7.visibility = INVISIBLE
               buttonRa8.visibility = VISIBLE
           }
           buttonRa8.setOnClickListener {
               text1.text = "Sekiz"
               sekiz.visibility = VISIBLE
               yedi.visibility = INVISIBLE
               buttonRa8.visibility = INVISIBLE
               buttonRa9.visibility = VISIBLE
           }
           buttonRa9.setOnClickListener {
               text1.text = "Dokuz"
               dokuz.visibility = VISIBLE
               sekiz.visibility = INVISIBLE
               buttonRa9.visibility = INVISIBLE
               buttonRa10.visibility= VISIBLE
               buttonA.visibility= VISIBLE

               buttonA.setOnClickListener {
                   val intent2 = Intent(this,MainActivity2::class.java)
                   startActivity(intent2)
               }

           }


       }

        buttonRa.setOnClickListener { buttonC() }

        buttonRa10.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)


        }








    }


}
