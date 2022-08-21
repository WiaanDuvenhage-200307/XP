package com.example.xp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.xp.databinding.ActivityResultsBinding
import com.example.xp.models.Constants

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

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val user = sharedPref.getString(Constants.USER_NAME, "")
        val userHighScore = sharedPref.getInt(Constants.HIGH_SCORE, 0)

        val username = intent.getStringExtra("username").toString()

        val score = intent.getStringExtra("score").toString()



        if(score.toInt() != 5){
            binding.ivHighScore.setImageResource(0)
            binding.tvResultHead.text = "Oof!"
            binding.tvResultSub.text = "Better luck next time"
        }else{
            binding.tvResultHead.text = "Poggers!"
            binding.tvResultSub.text = "You have set the new high score!"
            intent.putExtra("finalScore", score)
        }

        binding.tvScore.text = score



        binding.btnRestart.setOnClickListener{

            val intent = Intent(this, HomeActivity::class.java)
            //sends the username back to the categories view to be accessible
            intent.putExtra("username", username)
            intent.putExtra("finalScore", score)
            startActivity(intent)

        }
    }
}