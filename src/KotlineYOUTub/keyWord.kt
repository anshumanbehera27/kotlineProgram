

fun main(){
// WE can add the seperate list in side the  varagr keyWord
    // IT ONLY ALLOW INT OF ARRAY
    val list = intArrayOf(90, 34 , 33)
    // WHEN EVER I CAN USE THE  LIST PARAMETER  WE HAVE USE THE ASTRICK
val check = getMax(2,4,5,6,7,89,44, 6 , *list)
    println(check)
    searchfor("how to be a good programmer  ")
}
// TODO varagr key word
// in this paticular parameater we have to Insert how many number of paremeter we want
fun getMax(vararg numbers: Int):Int{
    var max =numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }

    }
    return max
}
// TODO: defult Argument
fun searchfor(search :String , searchEngine: String = "google"){
    println("search for $search on $searchEngine")
}
// TODO: Alternate sum






