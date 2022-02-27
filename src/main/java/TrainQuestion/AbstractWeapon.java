package TrainQuestion;

abstract class AbstractWeapon {
    abstract String weaponType();   // 可以定義抽象變數
    abstract void fun();    // 可以定義抽象方法，但不能設定功能，也就是不能實例化

    final String attack = "200";   // 可以定義fianl的變數與方法
    final void fun_2() {
        System.out.println("fianl方法可以在抽象類別中實現");
    }

    // 可以定義一般的變數與方法，也就是設定屬性
    // 並且可以設定功能，也就是實例化
    void print() {
        System.out.println(weaponType());
    }
    String a;
}

// 抽象類別中的，抽象定義可以由子類別來定義功能
// 抽象變數與方法，當類別被繼承時，就一定要呼叫
// 抽象類別通常用於需要相同設定的類別上，減少重複的程式碼
class AbstractRun extends AbstractWeapon {

    @Override
    String weaponType() {
        return "Axe";
    }

    @Override
    void fun() {
        System.out.println(weaponType() + "繼承abstract子類別實作測試");
    }

    // 可以在繼承abstract的class，執行主程式
    public static void main(String[] args) {
        AbstractRun weapon = new AbstractRun();
        weapon.print();
        weapon.fun();
        weapon.weaponType();
//        weapon.a; // 被繼承的抽象類別變數，無法直接被呼叫
    }
}