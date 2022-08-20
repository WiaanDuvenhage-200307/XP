package com.example.xp

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.xp.databinding.ActivityHomeBinding
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

        binding.btnBack.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnReset.setOnClickListener {
            //TODO: Reset Scores
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            val user = sharedPref.getString(Constants.USER_NAME, "")
            val userHighScore = sharedPref.getString(Constants.HIGH_SCORE, "")
        }

        //Navigate to Github
        binding.llGithub.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/WiaanDuvenhage-200307"))
            startActivity(browserIntent)
        }
    }
}