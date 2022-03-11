package LeetCodeKotlin

import Parking.getSetTest
import javafx.beans.binding.IntegerBinding

class ReverseKotlin {
    fun reverse(x: Int): Int {
        var result = 0
        var n = x
        if(x > Int.MAX_VALUE || x < Int.MIN_VALUE) return 0

        while (n != 0) {
            result = (n % 10) + result * 10
            n /= 10
        }

        return result
    }

    fun reverse_2(x: Int): Int = kotlin.runCatching {
        if(x < 0) -reverse_2(-x)
        else x.toString().reversed().toInt()
    }.getOrElse { 0 }
}

fun main() {
    val num1 = 123
    val num2 = -123
    val num3 = -120
    val reNum = ReverseKotlin()

    println(reNum.reverse(num1))
    println(reNum.reverse(num2))
    println(reNum.reverse(num3))

    println()
    println(reNum.reverse_2(num1))
    println(reNum.reverse_2(num2))
    println(reNum.reverse_2(num3))
}