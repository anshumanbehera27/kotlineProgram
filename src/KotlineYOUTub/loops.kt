package com.example.myapplicationkotlineuse

fun main(){
    val n = 10
    // todo  for loop
//    for (i in 1..n){
//        println(i)
//    }

 // // TODO we will use decrese aswell
//    for (i in 10 downTo 5 )
//    {
//        println(i)
//    }
   // TODO  We will increase the steps
//    for(i in 1..10 step 2 ){
//        println(i)
//    }
    // TODO USE IN THE charcter
//    for (i in 'a'..'z'){
//        println(i)
//    }

    // todo use of for loop
    val myArray = arrayOf(4,5,6,7,8,9)
    var max = myArray[0]
    for (item in myArray){
        if (item > max){
            max  = item
        }
    }
    println(max)

    //  TODO sum of the Array
    var sum = 0
    for (i in myArray){
        sum += i
    }
    println(sum )

    // find the avrage value

    var avg = 0.0
    for (i in 1..5)
    {
       var input  = readLine()?.toInt()
        if (input != null){
            avg += input / 5.0

        }
    }
    println("The Avg value is $avg")
}