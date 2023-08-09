package com.example.myapplicationkotlineuse

fun  main() {
    // TODO use of var
    var myvar = 5
    // if you assine the value after the allocation the current val is print
    println("my value is -> $myvar ")
    myvar = 34
    println("my value is - > $myvar")

    // TODO 1 use of val
    // here the val is use as constant value one you assine we are not able to use it
    val myval = 30
    println("my constant val is $myval")
    // we are not able to assine again
    // myval = 40 is not allowed
    // TODO 3 use of boolvar
    var myfun: Boolean = true
    println("The vale of the our val : $myfun")
    myfun = false
    println("The vale of the our val : $myfun")

    var favnumber = 23
    val check: Boolean = true
    if (check) {
        println("my Fav number is: $favnumber")


    }
}