package TrainQuestion;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        String[] pets = {"turtle", "dog", "cat"};
        System.out.println(pets[2]);

        try {
            System.out.print("Input number: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
        }catch (Exception e) {
            System.out.println("This not number.");
        }
    }
}
