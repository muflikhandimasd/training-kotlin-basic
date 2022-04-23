fun main() {
    var firstName : String = "Muflikhan"
    var address : String = """
        |Jalan belum jadi,
        |Tulungagung
    """.trimMargin()
    println(firstName)
    println(address)

//    Menggabungkan String
//    var namaDepan : String = "Muflikhan"
//    var namaBelakang : String = "Dwiprayogi"
//
//    var namaLengkap : String = namaDepan + " " + namaBelakang
//    println(namaLengkap)

//    String Template
    var namaDepan : String = "Muflikhan"
    var namaBelakang : String = "Dwiprayogi"

    var namaLengkap : String = "$namaDepan $namaBelakang"
    var desc : String = "Fullname char is ${namaLengkap.length}"
    println(namaLengkap)
    println(desc)
}
