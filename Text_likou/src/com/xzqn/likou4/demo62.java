package com.xzqn.likou4;

import java.util.Arrays;

public class demo62 {
    /*
    * 1470. 重新排列数组
    给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
    请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。*/
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int index = 0;
        for (int i = 0; n < nums.length; i++) {
            arr[index] = nums[i];
            index++;
            arr[index] = nums[n++];
            index++;
        }
        return arr;
    }
}
