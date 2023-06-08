package com.xzqn.likou2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo38 {
    /*1480. 一维数组的动态和
    给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。

    请返回 nums 的动态和。*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    public static int[] runningSum(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        if (nums.length == 2) {
            nums[1] += nums[0];
            return nums;
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
