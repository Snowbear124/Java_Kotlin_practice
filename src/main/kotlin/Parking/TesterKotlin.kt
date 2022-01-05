package Parking

import java.util.*

fun main() {
    Date().calendar()
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