package com.xzqn.likou2;

import java.util.Arrays;

public class demo27 {
    /**
     * LC. 在排序数组中查找元素的第一个和最后一个位置
     * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
     * <p>
     * 如果数组中不存在目标值 target，返回[-1, -1]。
     * <p>
     * 你必须设计并实现时间复杂度为O(log n)的算法解决此问题。
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode.cn/leetbook/read/binary-search/xenp13/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {0, 0};
        if (nums.length == 1 && nums[0] == target) {
            return arr;
        }

        for (int i = 0, j = nums.length - 1; i < j; ) {
            if (nums[i] != target) {
                i++;
            }
            if (nums[j] != target) {
                j--;
            }
            if (nums[i] == target && nums[j] == target) {
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
        }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }
}
