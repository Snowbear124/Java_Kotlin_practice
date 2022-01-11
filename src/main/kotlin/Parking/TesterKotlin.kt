package Parking

import java.time.LocalDateTime
import java.util.*

fun main() {
//    Date().calendar()

    //Car parking
    var id = "AA-0002"
    var enter = LocalDateTime.of(2022,1,3,9,0,0)

    val car2 = CarKotlin(id, enter)
    car2.leave = LocalDateTime.of(2022,1,3,13,30,0)
    println("Car id $id")
    println("Time = ${car2.duration()}")
    println("Free = ${car2.free()}")

    val test = getSetTest("0001")
    test.newData
    test.newData = "0002"
    test.newData
    test.timeTest = LocalDateTime.now()
}

class Date() {
    fun calendar() {
        //calendar
        val calendar = Calendar.getInstance()
        val calnow = calendar.time
        println("Now time: $calnow")

        calendar.set(2002, 2, 4)    //年,月都是用陣列方式呈現，所以會減1
        println("Set date: ${calendar.time}")

        val calYear = calendar.get(Calendar.YEAR)
        val calMonth = calendar.get(Calendar.MONTH)
        val calDay = calendar.get(Calendar.DATE)
        println("Get Year: ${calYear}")
        println("Get Month: ${calMonth + 1}")
        println("Get Day: ${calDay}")
    }
}