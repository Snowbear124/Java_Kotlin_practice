package BasicTest

class ArrayTest {
    fun intArray(nums: IntArray) {
        val array_1 = arrayOf(1, 2, 3)  // 直接填資料
        val array_2 = arrayOfNulls<Int>(5) // 空集合，需要設定大小

        val array_3 = Array<Int>(5) {
            it // it指陣列的index
        }
        print("array_3: ")
        array_3.forEach {   //
            print(it)
        }
        println()

        val intArray_1 = IntArray(5) // new int[5]
        val intArray_2 = intArrayOf() // new int[0]
        val intArray_3 = intArrayOf(1, 2, 3, 4, 5)

        // 如果陣列中所有元素中都有1，回傳true
        println(intArray_3.all{
            it == 1
        })

        // 如果陣列中有任意元素是1，回傳true
        println(intArray_3.any {
            it == 1
        })

        intArray_3.indices
    }
}

fun main() {
    var nums = intArrayOf(1, 2, 3, 4, 5)
    var nums_2 = intArrayOf(6, 7, 8)
    val array = ArrayTest().intArray(nums)
    val array_2 = nums + nums_2
    array_2.forEach {
        print("$it,")
    }
}