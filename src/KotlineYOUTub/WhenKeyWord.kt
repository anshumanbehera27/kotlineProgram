package com.example.myapplicationkotlineuse


// TODO WHEN KEY WORD USE
    // when we have larger number of condition we Can use  When
    // When  we have to use equal operator we can strictly write  the number
    fun main(){
        val age = readLine()?.toInt()

       when(age){
           in 0..17 -> println("You are a Young kid")
           18 -> println("FInally you are a YoungKId ")
           in 19..60 -> print("you are adult ")
           else -> println("You are old ")

       }


    var value = readLine()
    when(value){
        "india" -> println("namaste ")
        "usa" -> println("Hello")
        else -> println("I don't know ")
    }


    }


