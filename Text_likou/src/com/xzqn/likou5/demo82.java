package com.xzqn.likou5;


import java.lang.reflect.Array;
import java.util.Arrays;

public class demo82 {

    /**
     * 删除排序数组中的重复项 II
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode.cn/leetbook/read/all-about-array/x9nivs/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int max = nums[nums.length - 1];
        int count = 0;
        int j = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (j == nums[i]) {
                index++;
                if (index >= 3) {
                    nums[i] = max;
                    count++;
                }
            } else if (j != nums[i]) {
                j = nums[i];
                i--;
                index = 0;
            }
        }
        Arrays.sort(nums);
        return nums.length - count;
    }
}
