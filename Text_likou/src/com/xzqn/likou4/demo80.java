package com.xzqn.likou4;

public class demo80 {

    /**
     * 41. 缺失的第一个正数
     * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
     * <p>
     * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
     */
    public static void main(String[] args) {

        int[] nums = {1, -1, -2, 5};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] < arr.length) {
                arr[nums[i]] = nums[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
}
