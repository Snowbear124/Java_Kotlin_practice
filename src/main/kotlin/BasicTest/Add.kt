package BasicTest.kotlin

fun main() {
    val sum = Add_kotlin(3, 5).add2Num()
    println(sum)
}

class Add_kotlin(n1: Int, n2: Int) {
//    var n1 = 0
//    var n2 = 0

//    constructor(n1: Int, n2: Int) {
//        this.n1 = n1
//        this.n2 = n2
//    }

    var n1 = n1
    var n2 = n2

    fun add2Num(): Int {
        val sum = n1 + n2
        return sum
    }
}