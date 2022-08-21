package com.example.xp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.xp.databinding.ActivityCategoriesBinding
import com.example.xp.databinding.ActivityDialogBinding
import com.example.xp.models.Constants
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
    private lateinit var binding2: ActivityDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prevScore = intent.getStringExtra("finalScore").toString()
        Log.i("prevScore", prevScore)

        //Make Application Fullscree
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        binding2 = ActivityDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataReceive = findViewById(R.id.tv_username)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val user = sharedPref.getString(Constants.USER_NAME, "")
        val userHighScore = sharedPref.getString(Constants.HIGH_SCORE, "")

        val username = intent.getStringExtra("username").toString()

        binding.tvUsername.text = username

        binding.btnChangeName.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", username.toString())
            startActivity(intent)
        }

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

        binding.btnHighScore.setOnClickListener {

            val view = View.inflate(this, R.layout.activity_dialog, null)

            val builder = AlertDialog.Builder(this)
            //sets the view to this dialog xml file
            builder.setView(view)

            val dialog = builder.create()
            //show the dialog
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            //close the dialog
            view.findViewById<Button>(R.id.btn_confirm).setOnClickListener{
                dialog.dismiss()
            }

            editor.apply{
                putString(Constants.USER_NAME, username)
                putString(Constants.HIGH_SCORE, prevScore)
                Log.i("!!!TEST:  ", username)
                Log.i("!!!Saved Score: ", prevScore)
                apply() //to end
            }

            binding2.tvUser.text = username
            Log.i("!!!The User: ", binding2.tvUser.text.toString())
            binding2.tvUserHighScore.text = prevScore
//            findViewById<TextView>(R.id.tv_userHighScore).text = userHighScore

        }
    }
}