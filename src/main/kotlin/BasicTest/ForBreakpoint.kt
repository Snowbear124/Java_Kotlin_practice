package BasicTest

import com.sun.corba.se.impl.interceptors.InterceptorList

fun main() {
    val nums = listOf(1,2,3,4,5,6,7,8,9,10)
    BreakTest(nums)
    println("這行是在BreakTest fun後面 \n")

    ContinueTest(nums)
    println("這行是在ContinueTest fun後面 \n")

    ReturnTest(nums)
    println("這行是在ReturnTest fun後面 \n")
}

fun BreakTest(range : kotlin.collections.List<Int>) {
    println("Break測試")
    for (x in range) {
        if(x == 5) {
            println("第 $x 行後離開迴圈")
            break
        }
        println("第 $x 行")
    }
}

fun ContinueTest(range : kotlin.collections.List<Int>) {
    println("Continue測試")
    for (x in range) {
        if(x == 5) {
            println("$x 這行被跳過")
            continue
        }
        println("第 $x 行")
    }
}

fun ReturnTest(range : kotlin.collections.List<Int>) {
    println("Return測試")
    for (x in range) {
        if(x == 5) {
            println("第 $x 行後回到 fun")
            return
        }
        println("第 $x 行")
    }
}
