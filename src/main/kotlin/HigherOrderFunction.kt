fun main() {
    fun helloTes(name : String, transformer : (String) -> String) : String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

//    val lambdaUpper : (String) -> String = { it.uppercase()}
    val lambdaUpper  = { value : String -> value.uppercase()}
    println(helloTes("Muflikhan", lambdaUpper))
// Di Kotlin untuk bikin function tanpa nama langsung
    /*
    * {namaParam : TypeParam -> returnvaluenya}
    * */
    println(helloTes("Muflikhan", { value : String -> value.lowercase()}))

//    Tanpa Trailing Lambda
    val result1 = helloTes("Muflikhan", {value : String -> value.lowercase()})
//    Dengan Trailing Lambda
//    Syaratnya harus di parameter yang paling akhir
    val result2 = helloTes("Muflikhan"){value : String -> value.lowercase()}
}