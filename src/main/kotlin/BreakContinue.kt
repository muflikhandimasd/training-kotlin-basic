fun main() {
    var a = 0
    while (true){
        println("BreakMe")
        a++
        if (a > 10){
            break
        }
    }

//    Continue

    for (value in 1..100){
        if (value % 2 == 0){
            continue
        }
        println(value)
    }
}