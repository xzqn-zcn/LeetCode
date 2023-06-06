package com.xzqn.likou2;

import java.util.Arrays;

public class demo35 {
    //题目：多数元素

    /*给定一个大小为 n 的数组nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于⌊ n/2 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/majority-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 1, 1, 1, 1, 1, 1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int num = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                num++;
                if (num > nums.length / 2) {
                    return nums[i];
                }
            }
        }
        return num;
    }
}
