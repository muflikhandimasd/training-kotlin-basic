fun main() {
    fun helloTes(name : String, transformer : (String) -> String) : String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value : String): String{
        if (value == ""){
            return "UPS"
        } else{
            return value.uppercase()
        }
    }

    println(helloTes("Muflikhan", upper))
    println(helloTes("", upper))


    println(helloTes("Dimas", fun(value : String) : String {
        return value.lowercase()
    }))

    
}