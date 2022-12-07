package com.example.for_ch

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val button=findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            val intent = Intent(this, sekiller::class.java)
            startActivity(intent)
        }

        val button2=findViewById<Button>(R.id.button4)
        button2.setOnClickListener {
            val intent2 = Intent(this, MainActivity3::class.java)
            startActivity(intent2)
        }

        val button3=findViewById<Button>(R.id.button2)
        button3.setOnClickListener {
            val intent3 = Intent(this, Hayvanlar::class.java)
            startActivity(intent3)
        }

        val button4=findViewById<Button>(R.id.button5)

        button4.setOnClickListener {
            val intent4 = Intent(this, Renkler::class.java)
            startActivity(intent4)
        }
        val button5 = findViewById<Button>(R.id.button8)
        button5.setOnClickListener {
            Firebase.auth.signOut()
            val intent5 = Intent(this,MainActivity::class.java)
            startActivity(intent5
            )
        }


    }
}