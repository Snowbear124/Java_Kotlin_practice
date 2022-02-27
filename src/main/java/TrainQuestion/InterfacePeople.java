package TrainQuestion;

interface InterfacePeople {
    String name = "Jack";

    // 在此定義fianl的話，可以省略fianl，fianl不能被更改
    // 介面裡的變數都為fianl變數，無法定義fianl方法
    final int minAge = 18;
//    final void func_2() {}

    // 介面裡的方法都預設為抽象方法(abstract)，無法實例化
    // 也無法定義抽象變數
    abstract void print();
//    abstract int high = 165;
}

interface InterfaceFamily {
    int member = 1;
}

// 介面可以extends多個介面
interface InterfaceExtends extends InterfacePeople, InterfaceFamily {

}

// 介面用implements繼承，並且可以同時繼承一個以上的介面
class InterfaceRun implements InterfacePeople, InterfaceFamily {
    int age = 25;

    @Override
    public void print() {   //Interface子類別實作測試
        System.out.println(name);
        System.out.println(minAge);
        System.out.println(age);
        System.out.println("Family number = " + member);
    }

    // 可以再繼承Interface的class，執行主程式
    public static void main(String[] args) {
        InterfaceRun people = new InterfaceRun();
        people.age = 20;    // 覆寫自己class的設定，被繼承的介面變數可以直接被呼叫
        people.print();
    }
}

// 也可以繼承一個父類別，再繼承介面多個介面
class AbstractInterface extends AbstractWeapon implements InterfacePeople, InterfaceFamily {

    @Override
    String weaponType() {
        return null;
    }

    @Override
    void fun() {

    }

    @Override
    public void print() {

    }
}
