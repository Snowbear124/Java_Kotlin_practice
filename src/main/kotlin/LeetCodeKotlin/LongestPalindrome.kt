package LeetCodeKotlin

class LongestPalindrome {
    fun longestPalindrome(s: String): String {
        var dp = Array(s.length) { BooleanArray(s.length, {false}) }
        var ret = ""

        // 取得字元的索引值
        for (n1 in s.indices) {
//        for (n1 in 0.. s.length-1) {
            for (n2 in 0..n1) {
                if(s[n1] == s[n2] && (n1 - n2 <= 2 || dp[n1 -1][n2 +1])) {
                    dp[n1][n2] = true

                    // 比較大小，確保取得最長的回文字串
                    // 此處有"等號"，是避免遇上[1] - [1] = 0，卻沒有取得此字串的狀況
                    ret = if (n1 - n2 >= ret.length) s.substring(n2, n1+1) else ret
                }
            }
        }
        return ret
    }

    fun longestPalindrome_2(s: String): String {
        return ""
    }

    fun tryPalindrome(x: Int, y: Int, s: String) {
        var n1 = x
        var n2 = y
        var ret = ""
        while (n1 >= 0 && n2 < s.length && s[n1] == s[n2]) {
            n1 --
            n2 ++
        }
        ret = if(n2 - n1 - 1 > ret.length) s.substring(n1 +1, n2) else ret
    }
}

fun main() {
    val s = "rabcbaww"
    val reStr = LongestPalindrome().longestPalindrome(s)
    println(reStr)
}