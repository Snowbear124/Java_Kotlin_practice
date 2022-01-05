package Parking;

class MathUse {
    public static void main(String[] args) {
        math();
    }

    private static void math() {
        float n1 = -3.5f;
        float n2 = -5;
        int n3 = 2;
        int n4 = 9;

        float abs = Math.abs(-3.5f);
        System.out.println("abs(x) = " + abs);

        double exp =  Math.exp(-5);
        System.out.println("exp 5 = " + exp);

        double log = Math.log(2);
        System.out.println("log 2 = " + log);

        float max = Math.max(-5, 2);
        System.out.println("Max = " + max);

        float min = Math.min(-5, 2);
        System.out.println("Min = " + min);

        double pow = Math.pow(9, 2);
        System.out.println("pow = " + pow);

        double sqrt = Math.sqrt(9);
        System.out.println("Sqrt = " + sqrt);

        double ceil = Math.ceil(2);
        System.out.println("Ceil = " + ceil);
    }

}
