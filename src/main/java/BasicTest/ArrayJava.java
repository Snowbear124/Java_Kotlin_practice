package BasicTest;

public class ArrayJava {
    public static void main(String[] args) {
        // 一維陣列
        // 若設定超過[]的值，執行會出錯，未設定的默認值為0
        int[] array_1 = new int[5];
        array_1[0] = 1;
        array_1[4] = 6;

        int[] array_2 = {4, 8, 0, 7, 2};

        for (int i=0; i < 5; i++) {
            System.out.println("arra_1[" + i + "] = " + array_1[i]);
        }
        for (int i=0; i < 5; i++) {
            System.out.println("arra_2[" + i + "] = " + array_2[i]);
        }
        System.out.println();

        // 二維陣列
        // 排列方式為{00, 01} {10, 11} {20, 21}
        int[][] array_3 = new int[2][3];
        array_3[0][0] = 3;
        array_3[0][2] = 6;
        array_3[1][2] = 4;

        int[][] array_4 = {{0, 1}, {2, 3}, {4, 5}};
        String[] array_5 = {"A", "B", "C"};

        for (int i=0; i<2; i++) {
            for (int j=0; j<3; j++) {
                System.out.println("arra_3[" + i + "][" + j + "] = "
                        + array_3[i][j]);
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                System.out.println("arra_4[" + i + "][" + j + "] = "
                        + array_4[i][j]);
            }
        }

    }
}
