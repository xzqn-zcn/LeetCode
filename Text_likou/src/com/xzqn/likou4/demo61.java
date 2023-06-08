package com.xzqn.likou4;

import java.util.Arrays;

public class demo61 {
    /*
    * 1486. 数组异或操作
    给你两个整数，n 和 start 。
    数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
    请返回 nums 中所有元素按位异或（XOR）后得到的结果。*/
    public static void main(String[] args) {
        System.out.println(xorOperation(10, 5));
    }

    public static int xorOperation(int n, int start) {
        int[] sum = new int[2];
        for (int i = 0; i < n; i++) {
            sum[0] = start + 2 * i;
            sum[1] ^= sum[0];
        }
        return sum[1];
    }
}
