package com.example.xp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import com.example.xp.databinding.ActivityResultsBinding

class ResultsActivity : AppCompatActivity() {

    var backPressedTime: Long = 0
    private lateinit var binding: ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Make Application Fullscree
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root) //this sets what XML frontend to use

        if (backPressedTime + 3000 > System.currentTimeMillis()) {
            super.onBackPressed()
            finish()
        }

        val username = intent.getStringExtra("username").toString()

        val score = intent.getStringExtra("score").toString()

        if(score.toInt() != 5){
            binding.ivHighScore.setImageResource(0)
            binding.tvResultHead.text = "Oof!"
            binding.tvResultSub.text = "Better luck next time"
        }else{
            binding.tvResultHead.text = "Poggers!"
            binding.tvResultSub.text = "You have set the new high score!"
        }

        binding.tvScore.text = score

        binding.btnRestart.setOnClickListener{

            val intent = Intent(this, CategoriesActivity::class.java)
            //sends the username back to the categories view to be accessible
            intent.putExtra("username", username)
            startActivity(intent)
        }
    }
}