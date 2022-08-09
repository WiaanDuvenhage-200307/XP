package com.example.xp.models

import com.example.xp.R

object Constants {

    //method that will return the questions
    fun getAllQuestions() : ArrayList<Question> {
        //Create our empty ArrayList
        var allQuestions = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this player",
            R.drawable.scump,
            "Ian",
            "Seth",
            "James",
            "Abner"

        )

        val que2 = Question(
            2,
            "Who won the most Call of Duty Championships",
            R.drawable.cod_que2,
            "Scump",
            "Clayster",
            "Crimsix",
            "Karma"
        )

        allQuestions.add(que1)
        allQuestions.add(que2)

        return allQuestions
    }
}