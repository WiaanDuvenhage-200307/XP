package com.example.xp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xp.databinding.ActivityResultsBinding

class ResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root) //this sets what XML frontend to use

        binding.btnRestart.setOnClickListener{
            val intent = Intent(this, CategoriesActivity::class.java)
            startActivity(intent)
        }
    }
}