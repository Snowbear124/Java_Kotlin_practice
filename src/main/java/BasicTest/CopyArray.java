package BasicTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
    public void copyArray(int[] nums) {
        // 使用系統複製方法
        // 參數分別是新陣列、新陣列起始索引、要複製的陣列、複製的起始索引、長度
        int[] num_2 = new int[nums.length];
        System.arraycopy(nums, 0, num_2, 0, nums.length);

        // 使用Arrays的複製方法，此方法不用事先new一個陣列物件
        // 要複製的陣列，長度
        int[] num_3 = Arrays.copyOf(nums, nums.length);

        for (int i : num_2) {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i : num_3) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        CopyArray array = new CopyArray();
        int[] nums = {1, 4, 7, 8, 9, 3, 2};
        array.copyArray(nums);
    }
}
