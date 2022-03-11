package LeetCodeJava;

public class Reverse {
    public int reverse(int x) {
        boolean negNum = false;
        if(x < 0) {
            negNum = true;
            x = -x;
        }

        // 將int轉成String
        String intToStr = Integer.toString(x);
        StringBuffer reX = new StringBuffer(intToStr.length());
        for (int i = intToStr.length()-1; i >= 0; i--) {
            reX.append(intToStr.charAt(i));
        }

        int strToInt = Integer.parseInt(reX.toString());
        if (negNum) {
            strToInt = -strToInt;
            return strToInt;
        }else return strToInt;
    }

    public int reverse_2(int x) {
        int result = 0;

        // 避免數值超過32bit
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }

        while (x != 0) {
            int n = x % 10;
            result = result * 10 + n;
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Reverse reNum = new Reverse();
        int num1 = 123;
        int num2 = 130;
        int num3 = -137;

        System.out.println(reNum.reverse(num1));
        System.out.println(reNum.reverse(num2));
        System.out.println(reNum.reverse(num3));

        System.out.println();
        System.out.println(reNum.reverse_2(num1));
        System.out.println(reNum.reverse_2(num2));
        System.out.println(reNum.reverse_2(num3));
    }
}
