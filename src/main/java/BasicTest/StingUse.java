package BasicTest;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class StingUse {
    public static void main(String[] args) {
        String str = "  Holle! It is Java.  ";

        String print_1 = str.substring(2, 6);
        String print_2 = str.substring(5);

        System.out.println("0~4 = " + print_1);
        System.out.println("5~end = "+ print_2);

        char word = str.charAt(4);
        System.out.println("Char 4 = " + word);

        int index = str.indexOf('l');
        System.out.println(index);

        String replace = str.replace("olle", "i");
        System.out.println(replace);

        String deletEmpty = str.trim();
        System.out.println(deletEmpty);

        int length = str.length();
        System.out.println(length);

    }
}
