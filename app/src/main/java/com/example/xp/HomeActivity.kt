package com.example.xp

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.xp.databinding.ActivityHomeBinding
import com.google.android.material.snackbar.Snackbar


class HomeActivity : AppCompatActivity() {

    private var pressedTime: Long = 0
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Make Application Fullscree
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root) //this sets what XML frontend to use

        binding.button.setOnClickListener{

            val username = binding.userName.text

            if(username.toString() == ""){
                var snackbar = Snackbar.make(it, "Please Enter Your Name", Snackbar.LENGTH_LONG)
                snackbar.setAction("OK", {
                })
                snackbar.show()
                binding.userName.error = "Please add username"
            }else {
                val intent = Intent(this, CategoriesActivity::class.java)
                intent.putExtra("username", username.toString())
                startActivity(intent)
            }
        }

        //Lets user navigate to the settings page
        binding.btnSettings.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}