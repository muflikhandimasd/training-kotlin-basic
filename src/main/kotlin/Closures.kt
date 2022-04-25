fun main() {
    var counter : Int = 0

//    val lambdaIncrement  = {
//        println("Lambda Increment")
//        counter++
//    }

    val lambdaIncrement : () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousFunction = fun(){
        println("Anonymous Function")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousFunction()
    functionIncrement()
    lambdaIncrement()
    anonymousFunction()
    functionIncrement()
    println(counter)
}