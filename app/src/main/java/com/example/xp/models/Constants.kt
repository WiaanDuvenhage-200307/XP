package com.example.xp.models

import com.example.xp.R

object Constants {

    //method that will return the questions
    fun getAllQuestions() : ArrayList<Question> {
        //Create our empty ArrayList
        var allQuestions = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this player?",
            R.drawable.ic_launcher_foreground
            //insert drawable of player img,
            //insert inputs of text letters which will represent buttons
        )

        val que2 = Question(
            2,
            "Who was MVP in the 2016 World Championship?",
            R.drawable.ic_launcher_foreground
            //insert drawable of player img,
            //insert inputs of text letters which will represent buttons
        )

        allQuestions.add(que1)
        allQuestions.add(que2)

        return allQuestions
    }
}