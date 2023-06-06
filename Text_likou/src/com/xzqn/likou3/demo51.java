package com.xzqn.likou3;

public class demo51 {
    /*
    * 53. 最大子数组和
    给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
    子数组 是数组中的一个连续部分。*/
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int sum = 0;
        for (int num : nums) {
            sum += num;
            maxsum = Math.max(maxsum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }
}
