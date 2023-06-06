package com.xzqn.likou6;

import java.util.Arrays;

public class demo110 {
    /**1464. 数组中两元素的最大乘积 分数:1121
     * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
     * 请你计算并返回该式的最大值。
     */
    public static void main(String[] args) {
       int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
