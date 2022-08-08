package com.example.xp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xp.databinding.ActivityCategoriesBinding
import com.example.xp.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionsBinding.inflate(layoutInflater)

        val username = intent.getStringExtra("username").toString()

        binding.tvUsername.text = username

        setContentView(binding.root)


    }
}