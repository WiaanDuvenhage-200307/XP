package com.example.xp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.xp.databinding.ActivityHomeBinding
import com.google.android.material.snackbar.Snackbar


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root) //this sets what XML frontend to use
//        var actionBar = supportActionbar?.hide()

        binding.button.setOnClickListener{

            val username = binding.userName.text

            if(username.toString() == ""){
                var snackbar = Snackbar.make(it, "Please Enter Your Name", Snackbar.LENGTH_LONG)
                snackbar.setAction("OK", {
                    Log.i("OK SnackBar", "Yes")
                })
                snackbar.show()
                binding.userName.error = "Please add username"
            }else {
                val intent = Intent(this, CategoriesActivity::class.java)
                intent.putExtra("username", username.toString())
                startActivity(intent)



            }
        }
    }
}