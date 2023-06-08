package com.xzqn.likou6;

import java.util.*;

public class demo113 {
    /**
     * 1295. 统计位数为偶数的数字
     * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4 ,23, 34};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(String.valueOf(num).length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
