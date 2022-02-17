package LeetCodeKotlin

class TwoSum {
    fun main() {
        val nums_1 = arrayOf(2, 7, 9, 4)
        val traget_1 = 9

//        println(twoSum(nums_1, traget_1))
    }

    fun twoSum(nums: IntArray, traget: Int): IntArray {
        val list = nums

        for (i in 0..(nums.size-1)) {
            val diff = traget - nums[i]
            if(list.contains(diff)) {
                return intArrayOf(list.indexOf(diff), i)
            }
        }
        return intArrayOf(-1, -1)
    }
}