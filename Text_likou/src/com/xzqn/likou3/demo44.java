package com.xzqn.likou3;

import java.util.Arrays;

public class demo44 {
    /*
    * 75. 颜色分类
    给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
    我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
    必须在不使用库内置的 sort 函数的情况下解决这个问题。。*/
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 1};
        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int n0 = 0, n1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            nums[i] = 2;
            if (num < 2) {
                nums[n1++] = 1;
            }
            if (num < 1) {
                nums[n0++] = 0;
            }
        }
    }
}
