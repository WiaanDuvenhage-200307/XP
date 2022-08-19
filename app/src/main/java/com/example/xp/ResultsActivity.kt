package com.example.xp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.xp.databinding.ActivityResultsBinding

class ResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Make Application Fullscree
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root) //this sets what XML frontend to use

        val username = intent.getStringExtra("username").toString()

        binding.btnRestart.setOnClickListener{

            val intent = Intent(this, CategoriesActivity::class.java)
            //sends the username back to the categories view to be accessible
            intent.putExtra("username", username)
            startActivity(intent)
        }
    }
}