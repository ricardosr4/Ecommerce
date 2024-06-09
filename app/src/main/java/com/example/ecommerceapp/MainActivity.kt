package com.example.ecommerceapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerceapp.databinding.ActivityMainBinding
import com.example.ecommerceapp.ui.HomeActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToHome()
    }
    fun navigateToHome(){
        val intent =Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
    //ok
}