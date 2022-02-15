package TrainQuestion;

public class CompareString {
    public static void main(String[] args) {
        String a_1 = "This is a";
        String a_2 = "This is a";

        String b_1 = new String("This is b");
        String b_2 = new String("This is b");

        // == 比較的是儲存的地址
        System.out.println("== test: ");
        if(a_1 == a_2) System.out.println("a_1 == a_2"); // 都在同一個class，所以地址與內容都相同
        else System.out.println("a_1, a_2 not ==");

        if(b_1 == b_2) System.out.println("b_1 == b_2");
        else System.out.println("b_1, b_2 not ==");

        // equals比較的是儲存的內容
        System.out.println("\nequals test: ");
        if (a_1.equals(a_2)) System.out.println("a_1 equals a_2");
        else System.out.println("a_1, a_2 not equals");

        if (b_1.equals(b_2)) System.out.println("b_1 equals b_2");
        else System.out.println("b_1, b_2 not equals");

    }
}
