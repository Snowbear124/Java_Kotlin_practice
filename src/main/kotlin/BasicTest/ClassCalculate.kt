package BasicTest

class calculate() {
    fun sum(x: Int = 0, y: Int = 0) = println("$x + $y = ${x+y}")

    fun subtract(x: Int = 0, y: Int = 0) {
        println("$x - $y = ${x-y}")
    }

    fun multiply(x: Int = 0, y: Int = 0) {
        println("$x * $y = ${x*y}")
    }

    fun division(x: Int = 0, y: Int = 0) {
        println("$x / $y = ${x/y}")
    }
}

fun main() {
    calculate().sum(1,1)
    calculate().subtract(7, 3)
    calculate().multiply(3, 6)
    calculate().division(9,3)
}