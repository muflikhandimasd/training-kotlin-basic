fun String.hello() : String{
    return "Hello $this"
}

fun main() {
    val name = "Muflikhan"
    val extension = name.hello()
    println(extension)
}