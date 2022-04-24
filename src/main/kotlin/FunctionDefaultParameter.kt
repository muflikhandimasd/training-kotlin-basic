fun tesSay(firstName : String, lastName : String = "Kosong"){
    println("Say $firstName $lastName")
}

fun main() {
    tesSay("Muflikhan")
    tesSay("Budi", "Joko")
}