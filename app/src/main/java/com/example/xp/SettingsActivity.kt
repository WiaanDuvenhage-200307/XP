package com.example.xp

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.xp.databinding.ActivitySettingsBinding
import com.example.xp.models.Constants

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Make Application Fullscree
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userScore = intent.getStringExtra("finalScore").toString()

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val user = sharedPref.getString(Constants.USER_NAME, "")
        val userHighScore = sharedPref.getInt(Constants.HIGH_SCORE, 0)

        binding.btnBack.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        //reset score
        binding.btnReset.setOnClickListener {
            editor.apply{
                putString(Constants.USER_NAME, "")
                putInt(Constants.HIGH_SCORE, 0)
                apply() //to end
            }
            startActivity(intent)
        }

        //Navigate to Github
        binding.llGithub.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/WiaanDuvenhage-200307"))
            startActivity(browserIntent)
        }
        binding.tvHighScoreHolder.text = user
        binding.tvHighScore.text = userHighScore.toString()
    }
}