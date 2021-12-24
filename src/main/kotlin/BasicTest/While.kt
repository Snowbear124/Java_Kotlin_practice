package BasicTest

fun main() {
    var x = 0
    var y = 1
    while (x < 5) {
        println(x)
        x ++
    }

    do {
        println(y)
        y ++
    }while (y < 5)
}