package BasicTest;

public class HelloJava {
    public static void main(String[] args) {
//        Call p = new Call();    // 只能呼叫class，不能使用class+function，kotlin可以
//        p.hello();

//        Add number = new Add();
//        number.n1 = 3;
//        number.n2 = 4;
//        int sum = number.add2Num();
//        System.out.println(sum);

        Add number = new Add(3, 2);
        int sum = number.add2Num();
        System.out.println(sum);
    }
}
