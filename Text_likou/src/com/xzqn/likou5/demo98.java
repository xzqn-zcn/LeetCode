package com.xzqn.likou5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class demo98 {
    /**
     * 2644. 找出可整除性得分最大的整数
     * 给你两个下标从 0 开始的整数数组 nums 和 divisors 。
     * <p>
     * divisors[i] 的 可整除性得分 等于满足 nums[j] 能被 divisors[i] 整除的下标 j 的数量。
     * <p>
     * 返回 可整除性得分 最大的整数 divisors[i] 。如果有多个整数具有最大得分，则返回数值最小的一个。
     */
    public static void main(String[] args) {
        int[] nums = {73, 13, 21, 6}, divisors = {16, 10};
        System.out.println(maxDivScore(nums, divisors));
    }

    public static int maxDivScore(int[] nums, int[] divisors) {
        int[] arr = new int[divisors.length];
        for (int num : nums) {
            for (int i = 0; i < divisors.length; i++) {
                if (num % divisors[i] == 0) {
                    arr[i] += 1;
                }
            }
        }
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                arr[0] = arr[i];
                index = i;
            } else if (arr[i] == arr[0] && divisors[i] < divisors[index]) {
                arr[0] = arr[i];
                index = i;
            }
        }
        return divisors[index];
    }
}
