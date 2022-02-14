package TrainQuestion;

import java.beans.Expression;
import java.util.Scanner;

// finally, try catch練習
public class FianllyTest {
    public static void main(String[] args) {
        try {
            int b = 10/0;

        }catch (Exception e) {
            System.out.println(e);

        }finally {
            System.out.println("This is fianlly, it always run!");
        }

        System.out.print("輸入字串: ");
        Scanner scanner = new Scanner(System.in);

        try {
            // 取得輸入的值
            System.out.println("輸入字串: " + scanner.next());

//        } catch (NullPointerException e) {
//            System.out.println("空值異常的字串: " + e);

        } catch (Exception e) {
            System.out.println("例外處理的字串: " + e);

        } finally {
            scanner.close(); // 關閉Scanner

        }
    }
}

