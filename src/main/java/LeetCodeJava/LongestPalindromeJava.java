package LeetCodeJava;

import java.lang.reflect.Array;

public class LongestPalindromeJava {
    public String longestPalindrome(String s) {
        int strSize = s.length();
        boolean[][] dp = new boolean[strSize][strSize];
        int start = 0, end = 0;

        for(int i = 0; i < strSize; i++) {
            for(int j = i; j >= 0 ; j-- ) {
                // 檢查從索引 i 開始到索引 j 結束的字串是否是回文的
                if(s.charAt(i) == s.charAt(j) && ( i-j <= 2 || dp[i-1][j+1])) {
                    dp[i][j] = true;
                }

                // 計算字串的長度，如果從 i 開始到 j 結束的字串是回文
                if(dp[i][j] && i - j > end - start) {
                    end = i;
                    start = j;
                }
            }
        }
        return s.substring(start, end+1);
    }

    public String longestPalindrome_2(String s) {
        int strSize = s.length();
        boolean[][] dp = new boolean[strSize][strSize];
        int strat = 0, end = 0;

        for (int n1 = 0; n1 < strSize; n1++) {
            for (int n2 = 0; n2 <= n1; n2++) {
                if(s.charAt(n1) == s.charAt(n2)) {
                    // n2會+1，是因為第2個對照迴圈一定是取到比較後面的數字了，才會因為差異>2，而需要比對
                    if(n1 - n2 <= 2 || dp[n1 - 1][n2 + 1]) {
                        dp[n1][n2] = true;
                    }
                }

                if (dp[n1][n2]) {
                    if(n1 - n2 > end - strat) { // 確保不會重複取得較小的答案
                        end = n1;
                        strat = n2;
                    }
                }
            }
        }
        return s.substring(strat, end+1);
    }

    public static void main(String[] args) {
        LongestPalindromeJava s = new LongestPalindromeJava();
        String s1 = "abcba";
        String s2 = "aa";
        System.out.println(s.longestPalindrome_2(s1));
        System.out.println(s.longestPalindrome(s2));
    }
}
