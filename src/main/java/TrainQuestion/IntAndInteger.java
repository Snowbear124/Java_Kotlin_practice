package TrainQuestion;

public class IntAndInteger {
    public static void main(String[] args) {
        int int_1 = 127;
        int int_2 = 1127;
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
    }
}
