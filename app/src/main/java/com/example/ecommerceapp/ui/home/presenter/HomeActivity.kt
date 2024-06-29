package com.example.ecommerceapp.ui.home.presenter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerceapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToEmailSupport()

//esta funcion es para el search view, cambiar cuando se ejecute el searchView
        binding.svHome.setOnClickListener {
            binding.svHome.isIconified = false
        }


    }

    private fun navigateToEmailSupport() {
        binding.tvDirectSupport.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "rla.support@gmail.com", null))
            startActivity(Intent.createChooser(emailIntent, "enviar email..."))
        }
    }


}