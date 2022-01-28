package BasicTest

import com.sun.org.apache.xpath.internal.operations.Number

fun main() {
    val data1 = TypeTest(12).value
    val data2 = TypeTest("Test").value
    val data3 = TypeTest(null).value
    println("Int: ${data1}, String: ${data2}, Null: ${data3}")

    val data4 = TypeTestNoNull(90)
    val data5 = TypeNum(4)
    val data6 = TypeNum(9.6f)

    TypeFun().anyType("ABC")
    TypeFun().anyType(909)
}

class TypeTest<T> (t: T) {
    var value = t
}

class TypeFun {
    // 泛型函士, 可設單個或多個
    fun <T> anyType(pr: T) {
        println("Function: $pr")
    }
}

//約束型的泛值
// Any可以讓泛值不能為null
class TypeTestNoNull<T: Any> (t: T) {
    var value = t
}

class TypeNum<T: kotlin.Number> (t: T) {
    var value = t
}

