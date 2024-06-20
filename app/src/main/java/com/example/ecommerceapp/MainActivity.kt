package com.example.ecommerceapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerceapp.databinding.ActivityMainBinding

import com.example.ecommerceapp.ui.preLogin.presenter.PreLoginActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigate()
    }

    //esta funsion es solo de prueba para ver la navegacion de las pantallas
    private fun navigate() {
        val intent = Intent(this, PreLoginActivity::class.java)
        startActivity(intent)
        finish()
    }

}