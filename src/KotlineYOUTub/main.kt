package com.example.myapplicationkotlineuse

fun main(){
    // TODO operators
    val  x = 9
    var y = 3
    val z = 9
    val result = x + y
    println(result)

    println("The sum of the elelment is $result")
    // suppose  you want to fach multipleDAta at once Wrote inside the Curly bracket

    y = 6
    println("${x+y}")
    var  a:Float = 5.234F // Always add the floating point number with the f
    // always choose float number because it will use less memory
    var b = 4
    var c = 10
    println("sum is ${ a  }")
    val pi:Float = 3.4F
    var rediuse:Float = 2F

    println("the volume si ${0.75 * pi * Math.pow(rediuse.toDouble(), 3.0)}")

    // TODO 4 logicalOPerator
    // in this type of operator the And wil l  perform first and or will perform
    println(((x== y ) && (a > c)))


    val simple = 3 > 4 || 4 > 3 && 4 <= 4
    println(simple)

    val bool = true
    val hard_expersion = !(x != z) && bool || z > (x+y) && (!bool || y < z)
    println(hard_expersion)

}