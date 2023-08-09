

fun main(){
    // array is use for the several continer
    val myArray = arrayOf("hello" , "guys" , "whats Up")
    var len = myArray.size
    var i =  0
    while (i < len) {
        println(myArray[i])
        i++
    }
//    // while loops
//    var x = 3
//    while(x > 2){
//        println("hello")
//        x--


    var j = readLine()?.toInt()

    while (j != null &&  j >= 0 ){
        println(j)
        j--
    }

    // FOR LOOP
    for (i in myArray){
        println(i)
    }
    // Todo list of
    val list = mutableListOf(1, 2, 3)
    list.add(8)
    println(list)

    }


