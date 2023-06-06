package com.xzqn.likou5;

import java.util.Arrays;

public class demo92 {
    /**
     * 剑指 Offer II 004. 只出现一次的数字
     * 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[i];
    }
}
