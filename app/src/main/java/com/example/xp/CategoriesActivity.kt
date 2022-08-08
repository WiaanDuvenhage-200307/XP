package com.example.xp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xp.databinding.ActivityCategoriesBinding
import com.example.xp.models.Constants.getAllQuestions
import com.example.xp.models.Question

class CategoriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username").toString()

        binding.tvUsername.text = username


    }
}