package com.example.myapplicationkotlineuse

fun main(){
//    printThreeLine()
//  val p =   pow(2 , 4 )
//  println(p)
    var list = mutableListOf(1,9,8,3,4,5)
   var ind =  search_Index(list ,4 )
    println("index of this number is $ind")

}
// TODO return type
// when every you use the return type we have mention the data type at the end of the function
fun pow(base:Int , exponent:Int): Int {
    var result = 1
    for (i in 1.. exponent) {
        result *= base
    }
    //println("$base to the power of $exponent is $result")
    return result

}
// if there is only one line
fun multiply(a :Int , b:Int) = a * b

// TODO 12  Sum of the number
fun  sum(num:Int){
    var sum  = 0
    for (i in 1..num){
        sum += i

    }
    println("sum of the range from 1 to $num is $sum")
}
fun printThreeLine(){
    println("first")
    println("second")
    println("third")
}
// TODO SERCH the elelment in list
fun search_Index(list:List<Int> , num: Int):Int{
    var l = list.size
    for (i in 1..l){
        if (list.indexOf(i) == num) return i
    }
    return -1

}