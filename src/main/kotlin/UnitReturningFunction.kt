fun printHello(firstName : String? = null) : Unit{
    if(firstName == null){
        println("Hello Boy")
    } else{
        println("Hello $firstName")
    }
}

fun main() {
    printHello()
}