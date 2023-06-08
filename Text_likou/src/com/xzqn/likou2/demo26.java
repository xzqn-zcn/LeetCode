package com.xzqn.likou2;

public class demo26 {
    /**162. 寻找峰值
     * 峰值元素是指其值严格大于左右相邻值的元素。
     * <p>
     * 给你一个整数数组nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
     * <p>
     * 你可以假设nums[-1] = nums[n] = -∞ 。
     * <p>
     * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
     * <p>
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/find-peak-element
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int[] nums = {3, 2};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums[0] > nums[nums.length - 1] ? 0 : nums.length - 1;
    }
}
