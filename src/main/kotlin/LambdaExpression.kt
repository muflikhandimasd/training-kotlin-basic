fun main() {
//    Tipe datanya adalah function dg 2 parameter string
//    Return value dari tipe data functionnya adalah String
    val contohLambda : (String, String) -> String = {
//        Lambda tanpa kurung buka kurung tutup, langsung kurawal
//        Deklarasikan parameternya
        firstName : String, lastName : String ->
//        tanpa return udah otomatis return
        val result = "$firstName $lastName"
        result
    }

    val hasil  = contohLambda("Muflikhan", "Dimas")
    println(hasil)

//    IT
//    It hanya bisa digunakan jika parameternya hanya satu
//    It, otomatis dan tidak perlu dideklarasikan ulang
    val itParam : (String) -> String = {
        it.uppercase()
    }

    println(itParam("IT Param"))


//    Method Reference :
//    Membuat lambda expression dari method yg sudah ada
//    :: method reference tanpa (), hanya memanggil function saja tanpa melakukan sesuatu
    val toUpperCasee : (String) -> String = ::toUpper
//    -> sama saja dengan : untuk return valuenya
//    : untuk function yg ada namanya
//    -> untuk function yg tidak memiliki nama
    println(toUpperCasee("halo"))

}

fun toUpper(value : String) : String = value.uppercase()

