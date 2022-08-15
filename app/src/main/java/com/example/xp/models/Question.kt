package com.example.xp.models

// Setting up Question model
data class Question (
    val id: Int,
    val questionText: String,
    val img: Int,
    val answerOne: String,
    val answerTwo: String,
    val answerThree: String,
    val answerFour: String
)

