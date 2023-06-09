package com.xzqn.likou2;

public class demo31 {
    /*
    287. 寻找重复数
    给定一个包含n + 1 个整数的数组nums ，其数字都在[1, n]范围内（包括 1 和 n），可知至少存在一个重复的整数。

    假设 nums 只有 一个重复的整数 ，返回这个重复的数 。

    你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间。
*/
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));

    }

    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
