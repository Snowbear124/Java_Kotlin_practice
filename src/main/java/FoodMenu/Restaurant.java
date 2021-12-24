package FoodMenu;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input main food: ");
        String main = scanner.next();

        Order menu = new Order(main,"", "cake");
        menu.print();
    }
}
