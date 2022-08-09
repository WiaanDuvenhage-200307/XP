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
    //Don't know how I am going to work with data in the way I want to answer quiz questions
    //Concatenating text letters into an array maybe
)

