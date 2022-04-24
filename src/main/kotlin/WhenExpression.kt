fun main() {
    var nilai = 'C'
    when(nilai){
        'A' -> {
            println("Cool")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Mantap")
        }
        else -> {
            println("Try Again")
        }
    }

    when(nilai){
//        if(nilai == 'A' || )
        'A', 'B', 'C' -> {
            println("Wokee")
        } else -> {
            println("Yahh")
        }
    }

    nilai = 'B'
    val nilaiLulus:Array<Char> = arrayOf('A', 'B', 'C')
    when(nilai){
        in nilaiLulus -> {
            println("WES SIP")
        }
        !in nilaiLulus -> {
            println("SABAR")
        }
    }

//    When Expression is
    val name = "Muflikhan"
    when(name){
        is String -> {
            println("This is String")
        }
        !is String -> {
            println("This is not String")
        }
    }

//    When tanda variable pengganti if else
    val examValue = 65
    when{
        examValue > 80 -> {
            println("Good")
        }
        examValue > 60 -> {
            println("Not Bad")
        }
        else -> {
           println("Lets try again")
        }
    }
}