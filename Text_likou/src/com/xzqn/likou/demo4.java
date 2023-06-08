package com.xzqn.likou;

public class demo4 {
    public static void main(String[] args) {
        //寻找数组中心下标，使两边相等(不包括自身)
        /**724. 寻找数组的中心下标
         * 给你一个整数数组 nums ，请计算数组的 中心下标 。
         *
         * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
         *
         * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
         *
         * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
         */
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
