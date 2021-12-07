package BasicTest;

public class HelloJava {
    public static void main(String[] args) {
        Call p = new Call();    // 只能呼叫class，不能使用class+function，kotlin可以
        p.hello();
    }
}
