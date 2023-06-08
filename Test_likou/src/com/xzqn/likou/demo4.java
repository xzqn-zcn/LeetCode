package com.xzqn.likou;

public class demo4 {
    public static void main(String[] args) {
        //寻找数组中心下标，使两边相等(不包括自身)
        int[] nums = {1, 2, 3};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (true) {
                int a = 0;
                int b = 0;
                for (int j = 0; j < i; j++) {
                    a += nums[j];
                }
                for (int c = i + 1; c < nums.length; c++) {
                    b += nums[c];
                }
                if (a == b) {
                    return i;
                }
                if (i == nums.length - 1) {
                    break;
                }
            }

        }
        return -1;
    }
}
