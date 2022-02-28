package LeetCodeJava;

import java.util.ArrayList;
import java.util.List;

public class FindMedianSortedArraysJava {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int median = (int) Math.ceil((nums1.length + nums2.length)/2) -1;
        int arraySize = nums1.length + nums2.length;
        int temNum;
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }

        for (int i = nums1.length; i < arraySize; i++) {
            nums[i] = nums2[i- nums1.length];
        }

        for (int i = 0; i < arraySize; arraySize--) {
            if(nums[i] > nums[i+1]) {
                temNum = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temNum;
            }
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println(nums[i]);
        }

        return 0;
    }

    public static void main(String[] args) {
        FindMedianSortedArraysJava array = new FindMedianSortedArraysJava();
    }
}
