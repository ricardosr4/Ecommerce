package com.example.ecommerceapp.ui.preLogin.presenter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerceapp.databinding.ActivityPreLoginBinding
import com.example.ecommerceapp.ui.login.presenter.LoginActivity
import com.example.ecommerceapp.ui.register.presenter.RegisterActivity

class PreLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener { navigateToLogin() }
        binding.btnRegister.setOnClickListener { navigateToRegister() }
        binding.titleSupport.setOnClickListener { navigateToEmailSupport() }

    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToRegister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToEmailSupport() {
        val emailIntent =
            Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "rla.support@gmail.com", null))
        startActivity(Intent.createChooser(emailIntent, "enviar email..."))
    }


}