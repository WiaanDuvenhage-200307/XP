package com.example.xp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.xp.databinding.ActivityCategoriesBinding
import com.example.xp.models.Constants.getCodQuestions
import com.example.xp.models.Constants.getCsgoQuestions
import com.example.xp.models.Constants.getFortniteQuestions
import com.example.xp.models.Constants.getLeagueQuestions
import com.example.xp.models.Constants.getOverwatchQuestions
import com.example.xp.models.Constants.getValorantQuestions
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

        //if the user clicks on the Call of Duty Image
        binding.ivCod.setOnClickListener{
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra("username", username.toString())
                intent.putExtra("catName", "Call of Duty")
                intent.putExtra("category", "cod")
                startActivity(intent)


        }

        //if user clicks on League of Legends Image
        binding.ivCsgo.setOnClickListener{
            val intent = Intent(this, QuestionsActivity::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("catName", "Counter Strike: Global Offensive")
            intent.putExtra("category", "csgo")
            startActivity(intent)


        }

        //if user clicks on League of Legends Image
        binding.ivFortnite.setOnClickListener{
            val intent = Intent(this, QuestionsActivity::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("catName", "Fortnite")
            intent.putExtra("category", "fortnite")
            startActivity(intent)

        }

        //if user clicks on League of Legends Image
        binding.ivLol.setOnClickListener{
            val intent = Intent(this, QuestionsActivity::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("catName", "League of Legends")
            intent.putExtra("category", "lol")
            startActivity(intent)


        }

        //if user clicks on League of Legends Image
        binding.ivOw.setOnClickListener{
            val intent = Intent(this, QuestionsActivity::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("catName", "Overwatch")
            intent.putExtra("category", "ow")
            startActivity(intent)


        }

        //if user clicks on League of Legends Image
        binding.ivValorant.setOnClickListener{
            val intent = Intent(this, QuestionsActivity::class.java)
            intent.putExtra("username", username.toString())
            intent.putExtra("catName", "Valorant")
            intent.putExtra("category", "valorant")
            startActivity(intent)


        }
    }
}