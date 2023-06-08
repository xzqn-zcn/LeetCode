package com.xzqn.likou4;

import java.util.Arrays;

public class demo79 {
    /**
     * 2441. 与对应负数同时存在的最大正整数
     * 给你一个 不包含 任何零的整数数组 nums ，找出自身与对应的负数都在数组中存在的最大正整数 k 。
     * <p>
     * 返回正整数 k ，如果不存在这样的整数，返回 -1
     */
    public static void main(String[] args) {
        int[] nums = {-10, 8, 6, 7, -2, -3};
        System.out.println(Arrays.binarySearch(nums, 10));
        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (Arrays.binarySearch(nums, -nums[i]) > 0) {
                    return -nums[i];
                }
            }
        }
        return -1;
    }
}
