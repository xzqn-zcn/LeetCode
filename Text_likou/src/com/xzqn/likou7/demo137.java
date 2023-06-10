package com.xzqn.likou7;


public class demo137 {
    /**
     747. 至少是其他数字两倍的最大数
     给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
     请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。
     */
    public static void main(String[] args) {
        int[] nums = {1, 0};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int max = 0;
        int max2 = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max2 = max;
                max = nums[i];
                index = i;
            } else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        return (max2 * 2) > max ? -1 : index;
    }
}
