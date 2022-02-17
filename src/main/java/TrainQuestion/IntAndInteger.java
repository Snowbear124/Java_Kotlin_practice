package TrainQuestion;

public class IntAndInteger {
    public static void main(String[] args) {
        int int_1 = 127;
        int int_2 = 127;
        Integer integer_new_1 = new Integer(127);
        Integer integer_new_2 = new Integer(127);
        Integer integer_1 = 127;
        Integer integer_2 = 127;
        Integer integer_a = 128;
        Integer integer_b = 128;

        System.out.println("int_1 == int_2: " + (int_1 == int_2));
        System.out.println("int_1 == integer_new_1: " + (int_1 == integer_new_1));
        System.out.println("integer_new_1 == integer_new_2: " + (integer_new_1 == integer_new_2));
        System.out.println("integer_new_1 == integer_1: " + (integer_new_1 == integer_1));
        System.out.println("integer_1 == integer_2: " + (integer_1 == integer_2));
        System.out.println("integer_a == integer_b: " + (integer_a == integer_b));

        int a = 2;
        float b = 6;
        System.out.println(a += b); // 先轉成float再相加
//        System.out.println(a = a + b); //直接相加，因此會出現錯誤

        byte c = 126;
        byte d = 2;

        System.out.println(c += d);
        System.out.println(c = (byte) (c + d));
    }
}
