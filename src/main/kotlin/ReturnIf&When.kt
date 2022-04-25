fun main() {
//    fun sayWho(name : String = "") : String{
//        return if (name == ""){
//            "Hello Bro"
//        } else {
//            "Hello $name"
//        }
//    }

//    When
fun sayWho(name : String = "") : String{
    return when(name){
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}
    val tes = sayWho(name = "Budi")
    println(tes)
}