fun main() {
    val names : Array<String> = arrayOf("Muflikhan","Dimas")
//    val = final. Gaboleh dideklarasikan ulang, tapi untuk valuenya bisa diubah
    names.set(0, "Test")
    names[0] = "OK"
    println(names[0])

    val numbers : Array<Int> = arrayOf(2,4,5,6)
    println(numbers[0])

    val stringNullArray : Array<String?> = arrayOfNulls(3)
    stringNullArray[0] = null
    stringNullArray[1] = "Muflikhan"
    println(stringNullArray[2])
}
