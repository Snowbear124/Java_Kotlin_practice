package BasicTest

import java.util.*

fun main() {

    var x = 0
    var y = 1
    while (x < 5) {
        val scanner = Scanner(System.`in`)
        print("Input numbwer: ")

        val data = scanner.nextInt()
        println(data)
        x ++
    }

    do {
        println(y)
        y ++
    }while (y < 5)
}