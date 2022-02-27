package LeetCodeKotlin

class LengthOfLongestSubstringKt {
    fun lengthOfLongestSubstring(s: String): Int {
        var count = 0
        var first = 0
        var size = 0
        val list = mutableListOf<Char>()

        while (count < s.length) {
            val char = s[count]
            if(!list.contains(char)) {
                list.add(char)
                count ++
                if(list.size > size) size = list.size
            }else {
                list.remove(s[first])
                first ++
            }
        }

        return size
    }
}

fun main() {
    val s = LengthOfLongestSubstringKt()
    val s_1 = s.lengthOfLongestSubstring("abcabcbb")
    val s_2 = s.lengthOfLongestSubstring("attioii")
    println(s_1)
    println(s_2)
}