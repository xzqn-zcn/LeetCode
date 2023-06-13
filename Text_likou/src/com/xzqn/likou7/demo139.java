package com.xzqn.likou7;

public class demo139 {
    /**
     * 2475. 数组中不等三元组的数目
     * 给你一个下标从 0 开始的正整数数组 nums 。请你找出并统计满足下述条件的三元组 (i, j, k) 的数目：
     *
     * 0 <= i < j < k < nums.length
     * nums[i]、nums[j] 和 nums[k] 两两不同 。
     * 换句话说：nums[i] != nums[j]、nums[i] != nums[k] 且 nums[j] != nums[k] 。
     * 返回满足上述条件三元组的数目。
     */
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        System.out.println(unequalTriplets(nums));
    }
    public static int unequalTriplets(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i >= nums.length - 2){
                break;
            }
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] != nums[i] && nums[k] != nums[j]) {
                                count++;
                            }
                        }
                    }
                }
        }
        return count;
    }
}
