package com.xzqn.likou;

import java.util.*;

public class demo6 {
    /*给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
    算法的时间复杂度应该为 O(log (m+n)) 。

    来源：力扣（LeetCode）
    链接：https://leetcode.cn/problems/median-of-two-sorted-arrays
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        System.out.println(list);

        if (list.size() % 2 == 0) {
            int a = list.size() / 2;
            return (list.get(a) + list.get(a - 1)) / 2.0;

        } else {
            System.out.println("1111111:" + list.get(list.size() / 2));
            return list.get(list.size() / 2);
        }
    }
}
