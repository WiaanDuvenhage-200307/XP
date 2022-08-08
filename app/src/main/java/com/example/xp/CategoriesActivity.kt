package com.example.xp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.xp.databinding.ActivityCategoriesBinding
import com.example.xp.models.Constants.getAllQuestions
import com.example.xp.models.Question

class CategoriesActivity : AppCompatActivity() {

    lateinit var dataReceive: TextView

    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataReceive = findViewById(R.id.tv_username)

        val username = intent.getStringExtra("username").toString()

        binding.tvUsername.text = username


    }
}