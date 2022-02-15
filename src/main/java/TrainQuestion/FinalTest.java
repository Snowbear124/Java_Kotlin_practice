package TrainQuestion;

public class FinalTest {
    public static void main(String[] args) {
        CommonClass f = new CommonClass();
        // Max已被加上Fianl，無法被更改
//        f.MAx = 20;
        f.Min = 5;

        System.out.println("Max = " + f.MAx);
        System.out.println("Min = " + f.Min);
    }
}

// 普通的class可以被繼承
class test extends CommonClass {

}

// fianl放在類別前面，無法被繼承
//class test_2 extends FianlClassTest {
//
//}

