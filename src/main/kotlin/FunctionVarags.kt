fun hitungTotal(name : String, vararg values : Int) : Int{
    var total = 0
    for (value in values)
    {
        total += value
    }
    return total
}

fun main() {
//    val values = arrayOf(10,10,10,20)
    val res = hitungTotal("Muf", 10, 10,111,12)
    println(res)
}