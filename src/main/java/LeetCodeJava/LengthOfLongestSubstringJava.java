package LeetCodeJava;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LengthOfLongestSubstringJava {
    public int lengthOfLongestSubstring(String s) {
        int sNum = 0;
        int max = 0;
        List listString = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);

                if(!listString.contains(charS)) {
                    listString.add(charS);
                    max = Math.max(max, listString.size());
                } else {

                }
        }



        return max;
    }

    public int lengthOfLongestSubstring_2(@NotNull String s) {
        int sNum = 0;
        int last = 0;
        int max = 0;

        HashSet<Character> hash = new HashSet();
        while (sNum < s.length()) {
            char charS = s.charAt(sNum);
            if (!hash.contains(charS)) {
                hash.add(charS);
                sNum ++;
                max = Math.max(max, hash.size());
            }else {
                // 把重複的部分刪除，如果連續重複2個字元以上，就會刪2次
                hash.remove(s.charAt(last));
                last ++;
            }
        }
        return max;
    }

    // 最長的不重複句子
    public static void main(String[] args) {
        LengthOfLongestSubstringJava s = new LengthOfLongestSubstringJava();
        int sNum = s.lengthOfLongestSubstring_2("abcabcdavv");
        int sNum_2 = s.lengthOfLongestSubstring_2("cvuur");
        int sNum_3 = s.lengthOfLongestSubstring_2("pwwkew");
        System.out.println(sNum);
        System.out.println(sNum_2);
        System.out.println(sNum_3);
    }
}
