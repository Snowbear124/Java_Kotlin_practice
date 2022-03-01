package LeetCodeKotlin

class FindMedianSortedArraysKt {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val array = nums1 + nums2
        array.sort()

        if(array.size % 2 == 0) {
            val size = array.size/2
            val diff = (array[size-1] + array[size]) / 2.0
            println(diff)
            return diff

        }else {
            println(array[array.size/2].toDouble())
            return array[array.size/2].toDouble()
        }
    }
}

fun main() {
    val nums_1 = intArrayOf(1)
    val nums_2 = intArrayOf(3, 4)
    val array = FindMedianSortedArraysKt()
    array.findMedianSortedArrays(nums_1, nums_2)
}