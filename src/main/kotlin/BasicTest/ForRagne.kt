package BasicTest

import java.sql.DriverManager.println

fun main() {
    println("..的範圍表示")
    for(i in 1..5) print("$i \t")
    println("")

    println("step跳躍計數,跳2位數")
    for(i in 1..10 step 2) print("$i \t")
    println("")

    println("until不包含最後的數字")
    for(i in 1 until 5) print("$i \t")
    println("")

    println("downTo倒著數數")
    for(i in 5 downTo 1) print("$i \t")
}