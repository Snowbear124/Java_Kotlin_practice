package TrainQuestion;

public class CommonClass {
    // final加在資料型態前面時，就一定要定義一個數字
    final int MAx = 10;
    int Min;

    static void sum() {
        CommonClass num = new CommonClass();
        int sum = num.MAx + num.Min;
    }

    // 方法前加fianl，此方法無法被改寫
    final void pint(int n) {
        System.out.print(n);
    }
}
