package com.example.xp

import android.R
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.xp.databinding.ActivityQuestionsBinding
import com.example.xp.models.Constants
import com.example.xp.models.Constants.getCodQuestions
import com.example.xp.models.Constants.getCsgoQuestions
import com.example.xp.models.Constants.getFortniteQuestions
import com.example.xp.models.Constants.getLeagueQuestions
import com.example.xp.models.Constants.getOverwatchQuestions
import com.example.xp.models.Constants.getValorantQuestions
import com.example.xp.models.Question
import com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener


class QuestionsActivity : AppCompatActivity() {

    var backPressedTime: Long = 0

    private lateinit var binding: ActivityQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //exits app if user taps back on device
        if (backPressedTime + 3000 > System.currentTimeMillis()) {
            super.onBackPressed()
            finish()
        }

        backPressedTime = System.currentTimeMillis()

        //Make Application Fullscree
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        val categoryName = intent.getStringExtra("catName").toString()
        val selectedCategory = intent.getStringExtra("category").toString()
        var score = intent.getIntExtra("score", 0)

        val username = intent.getStringExtra("username").toString()

        binding.tvUsername.text = username
        binding.tvCategory.text = categoryName
        setContentView(binding.root)

        // Question Number
        var questionNumber = intent.getIntExtra("questionNumber", 0)

        // Questions
        var questions: ArrayList<Question> = arrayListOf()

        when (selectedCategory) {
            "cod" -> {
                questions = getCodQuestions()
            }
            "csgo" -> {
                questions = getCsgoQuestions()
            }
            "fortnite" -> {
                questions = getFortniteQuestions()
            }
            "lol" -> {
                questions = getLeagueQuestions()
            }
            "ow" -> {
                questions = getOverwatchQuestions()
            }
            "valorant" -> {
                questions = getValorantQuestions()
            }
        }

        // Gets Question
        val currentQuestion = questions[questionNumber]

        //Set score to the frontend
        binding.btnScore.text = score.toString()



        //show question number in questions view
        binding.tvQueNum.text = "Question ${questionNumber + 1}"

        updateUi(currentQuestion, username)

        binding.toggleButton.addOnButtonCheckedListener(OnButtonCheckedListener { group, checkedId, isChecked ->
            when (binding.toggleButton.checkedButtonId) {
                binding.button1.id -> {
                    var answer = binding.button1.text.toString()
                    navigate(
                        currentQuestion,
                        questions,
                        username,
                        categoryName,
                        selectedCategory,
                        questionNumber,
                        answer,
                        score
                    )
                }
                binding.button2.id -> {
                    var answer = binding.button2.text.toString()
                    navigate(
                        currentQuestion,
                        questions,
                        username,
                        categoryName,
                        selectedCategory,
                        questionNumber,
                        answer,
                        score
                    )
                }
                binding.button3.id -> {
                    var answer = binding.button3.text.toString()
                    navigate(
                        currentQuestion,
                        questions,
                        username,
                        categoryName,
                        selectedCategory,
                        questionNumber,
                        answer,
                        score
                    )
                }
                binding.button4.id -> {
                    var answer = binding.button4.text.toString()
                    navigate(
                        currentQuestion,
                        questions,
                        username,
                        categoryName,
                        selectedCategory,
                        questionNumber,
                        answer,
                        score
                    )
                }
            }
        })
    }
    fun navigate(currentQuestion: Question, questions: ArrayList<Question>, username: String, catName: String, catSelected: String, questionNumber: Int, answer: String, score: Int){

        //Shared Preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val user = sharedPref.getString(Constants.USER_NAME, "")
        val highScore = sharedPref.getInt(Constants.HIGH_SCORE, 0)

        if(questionNumber == questions.count() -1){
            val intent = Intent(this, ResultsActivity::class.java)
            //first check if last answer is correct before navigating
            if(currentQuestion.correctAnswer == answer) {
                intent.putExtra("score", (score + 1).toString())
            } else {
                intent.putExtra("score", score.toString())
            }
            if(score > highScore && currentQuestion.correctAnswer == answer){
                editor.apply{
                    putString(Constants.USER_NAME, username)
                    putInt(Constants.HIGH_SCORE, score + 1)
                    apply() //to end
                }
            } else if (score > highScore) {
                editor.apply{
                    putString(Constants.USER_NAME, username)
                    putInt(Constants.HIGH_SCORE, score)
                    apply() //to end
                }
            }
            intent.putExtra("username", username)
            startActivity(intent)
            finish()


        } else {

            //Navigate to next question
            val intent = Intent(this, QuestionsActivity::class.java)
            //pass username and next question value
            intent.putExtra("username", username)
            intent.putExtra("catName", catName)
            intent.putExtra("category", catSelected)
            intent.putExtra("questionNumber", questionNumber + 1)

            if(currentQuestion.correctAnswer == answer) {
                intent.putExtra("score", score + 1)
            } else {
                intent.putExtra("score", score)
            }

            if(score > highScore && currentQuestion.correctAnswer == answer){
                editor.apply{
                    putInt(Constants.HIGH_SCORE, score + 1)
                    apply() //to end
                }
            } else if (score > highScore) {
                editor.apply{
                    putInt(Constants.HIGH_SCORE, score)
                    apply() //to end
                }
            }

            startActivity(intent)
            finish()
        }
    }

    fun updateUi(currentQuestion: Question, username: String){
        if(currentQuestion.id == 1){
            binding.tvQuestionText.text = "${currentQuestion.questionText}"
        } else {
            binding.tvQuestionText.text = "${currentQuestion.questionText}"
        }

        binding.button1.text = currentQuestion.answerOne
        binding.button2.text = currentQuestion.answerTwo
        binding.button3.text = currentQuestion.answerThree
        binding.button4.text = currentQuestion.answerFour
        binding.ivQueImg.setImageResource(currentQuestion.img)
    }
}