package com.xzqn.likou3;

public class demo50 {
    /*
    * 268. 丢失的数字
    给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。*/
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 8, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int let = nums.length;
        for (int i = 0; i < nums.length; i++) {
            let = let - nums[i] + i;
        }
        return let;
    }
}
