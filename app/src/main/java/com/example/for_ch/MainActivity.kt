package com.example.for_ch

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.for_ch.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var actionBar: ActionBar

    private lateinit var progressDialog: ProgressDialog

    //Firebase auth
    private lateinit var firebaseAuth: FirebaseAuth

    private var email = ""

    private var sifre = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        actionBar = supportActionBar!!
        actionBar.title = "Giriş"

        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Lütfen bekleyiniz...")
        progressDialog.setMessage("Giriş yapılıyor...")
        progressDialog.setCanceledOnTouchOutside(false)

        firebaseAuth = FirebaseAuth.getInstance()
        checkUser()

        binding.buttonk.setOnClickListener {
            startActivity(Intent(this, Kayit::class.java))
        }
        binding.button.setOnClickListener {
            validateData()
        }
    }

    private fun validateData() {
        email = binding.email01.text.toString().trim()
        sifre = binding.sifre01.text.toString().trim()

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.email01.error = "Geçersiz email formatı!"
        } else if (TextUtils.isEmpty(sifre)) {
            binding.sifre01.error = "Lütfen şifrenizi giriniz."
        } else {
            firebaseLogin()
        }
    }

        private fun firebaseLogin() {

            progressDialog.show()
            firebaseAuth.signInWithEmailAndPassword(email, sifre)
                .addOnSuccessListener {
                    progressDialog.dismiss()

                    val firebaseUser = firebaseAuth.currentUser
                    val email = firebaseUser!!.email
                    Toast.makeText(this, "$email hesabı ile giriş yapıldı.", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainActivity2::class.java))
                    finish()
                }
                .addOnFailureListener { e ->
                    progressDialog.dismiss()
                    Toast.makeText(this, "Oturum açma başarısız. ${e.message}", Toast.LENGTH_SHORT).show()

                }
        }

        private fun checkUser(){
            val firebaseUser = firebaseAuth.currentUser
            if (firebaseUser != null){
                startActivity(Intent(this,MainActivity2::class.java))
                finish()
            }

       }
     }

