package com.xzqn.likou5;

public class demo83 {
    /**
     * 剑指 Offer 53 - I. 在排序数组中查找数字 I
     * 统计一个数字在排序数组中出现的次数。
     * 题意二分，可以但没必要
     */
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            } else if (nums[i] > target) {
                break;
            }
        }
        return count;
    }
}
