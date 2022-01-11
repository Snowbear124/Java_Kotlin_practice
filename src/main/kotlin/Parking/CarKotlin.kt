package Parking

import java.time.Duration
import java.time.LocalDateTime

class CarKotlin(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {    //kotlin可以直接在物件下方客製化set方法
            if(enter.isBefore(value)) {
                field = value   //set不可以用this, 要改用field來代表leave值
            }else {
                println("Time set error.")
            }
        }

    fun duration() = Duration.between(enter, leave).toMinutes()
    fun free(): Long = (Math.ceil(duration()/60.0).toLong())* 20


}

class getSetTest(var id: String) {
    var newData = id
        get() {
            println("取得 newData: $field")
            return field
        }
        set(value) {
            println("更新newData: $value")
            field = value
        }

    var timeTest: LocalDateTime? = null
        set(value) {
            println("更新時間timeTest: $value")
            field = value
        }
}