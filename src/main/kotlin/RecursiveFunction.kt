fun factorialLoop(value : Int) : Int{
    var result = 1
    for (i in value downTo 1){
        result *= i
    }
    return result
}

fun factorialRecursive(value : Int) : Int{
    return when(value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

fun main() {
    val hasil = factorialRecursive(5)
    println(hasil)
}