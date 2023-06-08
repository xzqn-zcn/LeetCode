package com.xzqn.likou;

import java.util.Arrays;

public class demo2 {
    /*1929. 数组串联
    给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，
        对于所有 0 <= i < n 的 i ，满足下述所有要求：
        ans[i] == nums[i]
        ans[i + n] == nums[i]
        具体而言，ans 由两个 nums 数组 串联 形成。
        返回数组 ans 。

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/concatenation-of-array
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(arr)));

    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int a = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nums.length; j++) {
                ans[a] = nums[j];
                a++;
            }
        }
        return ans;
    }
}
