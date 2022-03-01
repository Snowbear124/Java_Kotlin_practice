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

    public void sortOrder(int[] nums) {
        Arrays.sort(nums);
        System.out.print("sort: ");
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void fillArray(int[] nums) {
        // 將陣列內所有元素變成2
        Arrays.fill(nums, 2);
        System.out.print("fill_1: ");
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void fillArray_2(int[] nums) {
        // 將索引1~3的元素換成3
        Arrays.fill(nums, 1, 3, 3);
        System.out.print("fill_2: ");
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CopyArray array = new CopyArray();
        int[] nums = {1, 4, 7, 8, 9, 3, 2};
        int[] nums_2 = {1, 1, 1, 1, 1};
        array.copyArray(nums);
        System.out.println();

        array.fillArray(nums_2);
        array.fillArray_2(nums_2);
    }
}
