
fun main(){
    // TODO 7  LIST IS IMmutable
    val list = listOf(1,2,3,4,5) // valueof the list is can not be mutable list

    // We can creat the mutable list as well
    val list1 = mutableListOf( 2,3,3,54,5,6) // IT IS also zero based indexing
    list1.add(5 )
    list1.removeAt(5)
    println(list1)

    // TODO 9 how to take the input in list
//    val list2 = mutableListOf<Int>()
//    println("ENTER THE 5 intergert ")
//    for (i in 1..5){
//        val x = readLine()?.toInt()
//        if (x != null){
//            list2.add(x)
//        }
//    }
//    println(list2)

    // TODO 10 fibonachi of a number
    // take the input
    println("Enter the number n > 1 ")
    var  n = readLine()?.toInt()
    var a = 0
    var b = 1
    var c = 0
    // Creat a list

    var ans = mutableListOf<Int>()
    ans.add(0)
    ans.add(1)
    for (i in 2..n!!){
        c = ans[i-1] + ans[i-2]
        ans.add(c )

    }
    println(ans)



}