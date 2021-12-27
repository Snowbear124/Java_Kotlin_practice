package BasicTest;

public class Add {
    int n1 = 0;
    int n2 = 0;

    public Add(int n1, int n2) {
        this.n1 = n1;   // this = class Add()
        this.n2 = n2;
    }

    public int add2Num() {
        int num = n1 + n2;
        return num;
    }
}



