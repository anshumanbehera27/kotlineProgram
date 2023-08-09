package com.example.myapplicationkotlineuse

fun main(){
    val x = 5
    val y = 7
    val z = if(x + y == 12) 5 else 7
    if (x < y){
        print("x is lesser then y ")

    } else if (x > y){
        println("x is  greater then y ")
    }else{
        println("x is equal to y ")
    }

    println("the value of z is $z")
// if you use only one line to there is no need to  use the {}
    // TODO 5check the string is polidrom
    val name = "appa"
    var check = name.reversed()
    if (name.equals(check)) {
        println("this is polidrom ")
    }
    else println("this is not a polidrom")

}