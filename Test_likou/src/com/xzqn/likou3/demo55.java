package com.xzqn.likou3;

public class demo55 {
    /*
    * 2656. K 个元素的最大和
给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。你需要执行以下操作 恰好 k 次，最大化你的得分：

    从 nums 中选择一个元素 m 。
    将选中的元素 m 从数组中删除。
    将新元素 m + 1 添加到数组中。
    你的得分增加 m 。
    请你返回执行以上操作恰好 k 次后的最大得分。*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maximizeSum(arr, 3));
    }

    public static int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        System.out.println(max);
        for (int i = 1; i < k; i++) {
            max += max + 1;
        }
        return max;
    }
}
