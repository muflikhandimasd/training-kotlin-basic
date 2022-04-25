inline fun saySayTes(firstName : () -> String,
                     noinline lastName : ()-> String): String
{
    return "Say ${firstName()} ${lastName()}"
}


fun main() {
    for (i in 1..10){
        println(saySayTes({"Muflikhan"}, {"Dimas"}))
    }
}