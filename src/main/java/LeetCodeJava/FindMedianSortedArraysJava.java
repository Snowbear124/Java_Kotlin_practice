package LeetCodeJava;

import java.util.Arrays;

public class FindMedianSortedArraysJava {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int[] nums = new int[nums1.length + nums2.length];
        int arraySize = nums1.length + nums2.length;
        int median = (int) Math.ceil((arraySize)/2) -1;
        int[] nums = Arrays.copyOf(nums1, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, arraySize);
        Arrays.sort(nums);

        if (nums.length % 2 == 0) {
            System.out.println((nums[median] + nums[median+1])/2);
            return (nums[median] + nums[median+1])/2;
        }else {
            System.out.println(nums[median]);
            return nums[median];
        }
    }

    public double findMedianSortedArrays_2(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);

        Arrays.sort(nums);
        if(nums.length % 2 == 0) {
            double diff = (nums[nums.length/2 -1] + nums[nums.length/2]) / 2d;
            System.out.println(diff);
            return diff;
        }else {
            int median = (int) Math.floor(nums.length/2);
            System.out.println(nums[median]);
            return nums[median];
        }
    }

    public static void main(String[] args) {
        FindMedianSortedArraysJava array = new FindMedianSortedArraysJava();
        int[] num_1 = {1,3};
        int[] num_2 = {2,4};
        array.findMedianSortedArrays_2(num_1, num_2);
    }
}
