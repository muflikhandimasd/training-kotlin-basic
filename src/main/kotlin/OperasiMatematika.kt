fun main() {
    val result : Int = 10/3
    val result2 = 10.0 /3.0
    println(result)
    println(result2)
    val result3 = 10+10/2
    println(result3)

//    Augmented Assignment
    var total : Int = 0

    val barang1:Int = 100
//    total = total + barang1
    total += barang1
    val barang2 : Int = 200
//    total = total + barang2
    total += barang2
    println(total)

    total++ //total = total + 1
    total++ //total = total + 1
    total++ //total = total + 1
    total-- //total = total - 1

    println(total)
    val suhu = -2
    println(suhu)

    val sehat = true
    println(!sehat)

}