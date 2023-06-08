package com.xzqn.likou;

public class demo5 {
    public static void main(String[] args) {
        /*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
        请必须使用时间复杂度为 O(log n) 的算法。
        作者：LeetCode
        链接：https://leetcode.cn/leetbook/read/array-and-string/cxqdh/
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 7));

    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
            if (i == nums.length - 1) {
                return i + 1;
            }
        }
        return 0;
    }
}
