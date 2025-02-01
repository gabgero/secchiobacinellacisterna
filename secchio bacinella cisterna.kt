import java.util.Scanner
val input = Scanner(System.`in`)

fun main(args: Array<String>) {
    println("Ciao!")
    println("cosa vuoi fare? secchio da 1 litro, bacinella da 0,2 litri o cisterna da 1000 litri?")
    var scelta: String

    scelta = input.nextLine()
    if (scelta == "secchio") {
        var litri: Double
        var capacità: Double
        var litritot: Double

        litritot = 0
        capacità = 1000
        println("ok riempi il secchio fino a 1 litro (1000 ml)")
        while (litritot < capacità) {
            println("Inserisci litri")
            println(litritot)
            litri = input.nextDouble()
            litritot = litri + litritot
        }
        if (litri == capacità) {
            println("hai riempito al 100%!")
        } else {
            println("hai riempito troppo")
            println(litritot)
        }
    } else {
        if (scelta == "bacinella") {
            var litri: Double
            var capacità: Double
            var litritot: Double

            litritot = 0
            capacità = 200
            println("ok riempi la bacinella fino a 0,2 litri (200 ml)")
            while (litritot < capacità) {
                println("Inserisci litri")
                println(litritot)
                litri = input.nextDouble()
                litritot = litri + litritot
            }
            if (litri == capacità) {
                println("hai riempito al 100%!")
            } else {
                println("hai riempito troppo")
                println(litritot)
            }
        } else {
            var litri: Double
            var capacità: Double
            var litritot: Double

            litritot = 0
            capacità = 1000000
            println("ok riempi cisterna fino a 1000 litri (1000000 ml)")
            while (litritot < capacità) {
                println("Inserisci litri")
                println(litritot)
                litri = input.nextDouble()
                litritot = litri + litritot
            }
            if (litri == capacità) {
                println("hai riempito al 100%!")
            } else {
                println("hai riempito troppo")
                println(litritot)
            }
        }
    }
    println("digita fine")
    var fine: String

    fine = input.nextLine()
}
