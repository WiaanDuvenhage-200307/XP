package com.example.xp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.xp.databinding.ActivityCategoriesBinding
import com.example.xp.databinding.ActivityQuestionsBinding
import com.example.xp.models.Constants.getCodQuestions
import com.example.xp.models.Constants.getCsgoQuestions
import com.example.xp.models.Constants.getFortniteQuestions
import com.example.xp.models.Constants.getLeagueQuestions
import com.example.xp.models.Constants.getOverwatchQuestions
import com.example.xp.models.Constants.getValorantQuestions
import com.example.xp.models.Question

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        val categoryName = intent.getStringExtra("iv_lol").toString()


        val username = intent.getStringExtra("username").toString()


        binding.tvUsername.text = username
        binding.tvCategory.text = categoryName
        setContentView(binding.root)

        var questionNumber = intent.getIntExtra("questionNumber", 0)

        val codQuestions = getCodQuestions()
        val csgoQuestions = getCsgoQuestions()
        val fortniteQuestions = getFortniteQuestions()
        val leagueQuestions = getLeagueQuestions()
        val owQuestions = getOverwatchQuestions()
        val valQuestions = getValorantQuestions()

        val currentQuestion = owQuestions[questionNumber]

        Log.i("Question Count: ", "${currentQuestion.questionText}")

        updateUi(currentQuestion, username, categoryName)

        binding.btnA4.setOnClickListener{
            if(questionNumber + 1 == owQuestions.count()){
                //TODO: Navigate to Results Activity
                val intent = Intent(this, ResultsActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                //Navigate to next question

                //TODO: Capture the answered question (validation)
                val intent = Intent(this, QuestionsActivity::class.java)
                //pass username and next question value
                intent.putExtra("username", username)
                intent.putExtra("questionNumber", questionNumber + 1)
                //TODO: pass score

                startActivity(intent)
                finish()
            }
        }


    }

    fun updateUi(currentQuestion: Question, username: String, categoryName: String){
        if(currentQuestion.id == 1){
            binding.tvQuestionText.text = "${currentQuestion.questionText}"
        } else {
            binding.tvQuestionText.text = "${currentQuestion.questionText}"
        }

        binding.btnA1.text = currentQuestion.answerOne
        binding.btnA2.text = currentQuestion.answerTwo
        binding.btnA3.text = currentQuestion.answerThree
        binding.btnA4.text = currentQuestion.answerFour
        binding.ivQueImg.setImageResource(currentQuestion.img)
    }
}