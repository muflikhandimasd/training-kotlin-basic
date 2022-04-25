tailrec fun display(value : Int){
    println(value)
    if (value > 0){
        display(value - 1)
    }
}

tailrec fun factorialTailrec(value: Int, total : Int = 1) : Int{
    return when(value){
        1 -> total
        else -> factorialTailrec(value - 1, total * value)
        /*
        * factorialTail(5, 1)
          factorialTail(4, 5)
          factorialTail(3, 20)
          factorialTail(2, 60)
          factorialTail(1, 120)
          120
        */
    }
}


fun main() {
    display(5)
    val result = factorialTailrec(5)
    println(result)
}