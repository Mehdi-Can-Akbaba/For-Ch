package com.example.for_ch

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.example.for_ch.databinding.ActivityOpenBinding
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class open : AppCompatActivity() {
    private val splashScreen = 5000
   lateinit var binding: ActivityOpenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOpenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val animasyon1 = AnimationUtils.loadAnimation(this,R.anim.animasyon1)
        val animasyon2 = AnimationUtils.loadAnimation(this,R.anim.animasyon2)
        val animasyon3 = AnimationUtils.loadAnimation(this,R.anim.animasyon3)

        val imageView = binding.button7
        val imageView2 = binding.imageView6
        val imageView3 = binding.imageView7
        val imageView4 = binding.imageView9
        val imageView5 = binding.imageView10
        val imageView6 = binding.textView

        imageView.animation = animasyon3
        imageView2.animation = animasyon2
        imageView3.animation = animasyon1
        imageView4.animation = animasyon2
        imageView5.animation = animasyon2
        imageView6.animation = animasyon3

        Handler().postDelayed({

        val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },splashScreen.toLong())

    }
}