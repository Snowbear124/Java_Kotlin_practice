package LeetCodeKotlin

class TwoSum {
    fun twoSum(nums: IntArray, traget: Int): IntArray {
        val list = nums
//        val list_2 = mutableListOf<Int>()
//
//        for (i in 0..nums.size-1) {
//            list_2.add(nums[i])
//        }

        for (i in 0..nums.size-1) {
            val diff = traget - nums[i]
            if (list.contains(diff)) {
                println("[$i, ${list.indexOf(diff)}]")
                return intArrayOf(list.indexOf(diff), i)
            }
        }
        return intArrayOf(-1, -1)
    }

    fun twoSun_2(nums: IntArray, traget: Int): IntArray {
//        val indexlist = nums.withIndex().toList()
        // forEach與for有一樣的功能
        // forEachIndexed是取得索引與元素值
        nums.forEachIndexed(){ index, value ->
            val diff = traget - value
            // 讓最初的索引值不會跟nums陣列的索引值有衝突
            if(nums.contains(diff) && index != nums.indexOf(diff)) {
                println("[$index, ${nums.indexOf(diff)}]")
                return intArrayOf(index, nums.indexOf(diff))

            }else if (nums.contains(diff) && nums.size == 2) {
                println("[$index, ${index+1}]")
                return intArrayOf(index, index+1)
            }

        }
        return intArrayOf()
    }
}

fun main() {
    val nums_1 = intArrayOf(2, 7, 9, 4)
    val traget_1 = 9
    val runFunc = TwoSum()
//    runFunc.twoSum(nums_1, traget_1)
//    runFunc.twoSum(intArrayOf(3,2,4), 6)
//    runFunc.twoSum(intArrayOf(3,3), 6)

    runFunc.twoSun_2(nums_1, traget_1)
    runFunc.twoSun_2(intArrayOf(3,2,4), 6)
    runFunc.twoSun_2(intArrayOf(3,3), 6)
}