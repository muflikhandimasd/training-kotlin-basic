fun main() {
//    For Loop Array
    val names = arrayOf("Muflikhan", "Dimas", "Dwiprayogi")
    for (name in names){
        println(name)
    }

//    For range
    for(value in 0..100){
        println(value)
    }

    for(value in 1000 downTo 5 step 4){
        println(value)
    }
}