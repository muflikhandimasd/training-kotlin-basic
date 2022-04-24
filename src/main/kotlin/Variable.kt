const val APP = "Kotlin Basic"
const val VER = "1.0.0"

fun main() {
    var firstName : String = "Muflikhan"
    val lastName : String = "Dimas"
    println(lastName)

//    lastName = "Dwiprayogi" //Error
    println(lastName)

//    Nullable
    var name : String? = null
//    name = "Muflikhan"
    println(name)
    println(name?.length)
    println("$APP : $VER")

}