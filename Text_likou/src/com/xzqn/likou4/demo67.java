package com.xzqn.likou4;

import jdk.jfr.Unsigned;

public class demo67 {
    /*
    * 1010. 总持续时间可被 60 整除的歌曲
    在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
    返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望下标数字 i 和 j 满足  i < j 且有 (time[i] + time[j]) % 60 == 0。*/
    public static void main(String[] args) {
        int[] time = {30, 20, 150, 100, 40};
        //int[] time = {418, 204, 77, 278, 239, 457, 284, 263, 372, 279, 476, 416, 360, 18};
        System.out.println(numPairsDivisibleBy60(time));
    }

    public static int numPairsDivisibleBy60(int[] time) {
        long[] nums = new long[60];
        for (int i = 0; i < time.length; i++) {
            nums[time[i] % 60]++;
        }
        long count = 0;
        for (int i = 1; i < nums.length / 2; i++) {
            count += nums[60 - i] * nums[i];
        }
        count += nums[30] * (nums[30] - 1) / 2;
        count += nums[0] * (nums[0] - 1) / 2;
        return (int) count;
    }
}
