package com.xzqn.likou6;

import java.util.*;

public class demo103 {
    /**
     * 2540. 最小公共值
     * 给你两个整数数组 nums1 和 nums2 ，它们已经按非降序排序，请你返回两个数组的 最小公共整数 。如果两个数组 nums1 和 nums2 没有公共整数，请你返回 -1 。
     * <p>
     * 如果一个整数在两个数组中都 至少出现一次 ，那么这个整数是数组 nums1 和 nums2 公共 的。
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {2, 4};
        System.out.println(getCommon(nums1, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {

        int i = 0;//nums1的索引
        int j = 0;//nums2的索引

        while (i < nums1.length && j < nums2.length) {//退出循环条件
            if (nums1[i] == nums2[j]) {//等于直接返回
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {//如果nums1[i]索引上的值大于nums2[j]上的，索引j++
                j++;
            } else {//否则i索引++；
                i++;
            }
        }
        //跳出循环说明没有相同的数，返回-1
        return -1;
    }
}
