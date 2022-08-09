package com.example.xp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.xp.databinding.ActivityCategoriesBinding
import com.example.xp.models.Constants.getAllQuestions
import com.example.xp.models.Question
import com.google.android.material.snackbar.Snackbar

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

        //if the user clicks on the Call of Duty Image
        binding.ivCod.setOnClickListener{
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra("username", username.toString())
                startActivity(intent)
//            binding.ivCod.setTag(0, "Call of Duty")


        }
    }
}