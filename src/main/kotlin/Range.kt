fun main() {
//    val range = 1..100
    val range = 100 downTo 1 step 5
    println(range)
    println(range.count())
    println(range.contains(20))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
}
