package com.example.for_ch

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Renkler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_renkler)

        val buttonRe = findViewById<Button>(R.id.button22)



        buttonRe.setOnClickListener {

                var i = (0..9).random()

                if (i == 0) {
                    buttonRe.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    buttonRe.text = "Beyaz"
                    buttonRe.setTextColor(Color.parseColor("#000000"))

                } else if (i == 1) {
                    buttonRe.setBackgroundColor(Color.parseColor("#000000"))
                    buttonRe.text = "Siyah"
                    buttonRe.setTextColor(Color.parseColor("#FFFFFF"))

                }else if (i == 2) {
                    buttonRe.setBackgroundColor(Color.parseColor("#FFFF00"))
                    buttonRe.text = "Sarı"
                    buttonRe.setTextColor(Color.parseColor("#000000"))

                } else if (i == 3) {
                    buttonRe.setBackgroundColor(Color.parseColor("#FF0000"))
                    buttonRe.text = "Kırmızı"
                    buttonRe.setTextColor(Color.parseColor("#000000"))

                }else if (i == 4) {
                    buttonRe.setBackgroundColor(Color.parseColor("#0000FF"))
                    buttonRe.text = "Mavi"
                    buttonRe.setTextColor(Color.parseColor("#000000"))

                }else if (i == 5) {
                    buttonRe.setBackgroundColor(Color.parseColor("#FF7F00"))
                    buttonRe.text = "Turuncu"
                    buttonRe.setTextColor(Color.parseColor("#000000"))

                }else if (i == 6) {
                    buttonRe.setBackgroundColor(Color.parseColor("#008000"))
                    buttonRe.text = "Yeşil"
                    buttonRe.setTextColor(Color.parseColor("#000000"))

                }else if (i == 7) {
                    buttonRe.setBackgroundColor(Color.parseColor("#000080"))
                    buttonRe.text = "Mor"
                    buttonRe.setTextColor(Color.parseColor("#000000"))

                }else if (i == 8) {
                    buttonRe.setBackgroundColor(Color.parseColor("#FF69B4"))
                    buttonRe.text = "Pembe"
                    buttonRe.setTextColor(Color.parseColor("#000000"))

                }else if (i == 9) {
                    buttonRe.setBackgroundColor(Color.parseColor("#808080"))
                    buttonRe.text = "Gri"
                    buttonRe.setTextColor(Color.parseColor("#000000"))
                }

            }

        }
    }
