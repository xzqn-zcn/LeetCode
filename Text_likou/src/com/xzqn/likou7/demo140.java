package com.xzqn.likou7;

public class demo140 {
    /**1375. 二进制字符串前缀一致的次数
     * 给你一个长度为 n 、下标从 1 开始的二进制字符串，所有位最开始都是 0 。我们会按步翻转该二进制字符串的所有位（即，将 0 变为 1）。
     *
     * 给你一个下标从 1 开始的整数数组 flips ，其中 flips[i] 表示对应下标 i 的位将会在第 i 步翻转。
     *
     * 二进制字符串 前缀一致 需满足：在第 i 步之后，在 闭 区间 [1, i] 内的所有位都是 1 ，而其他位都是 0 。
     *
     * 返回二进制字符串在翻转过程中 前缀一致 的次数。
     */
    public static void main(String[] args) {
        int[] flips = {4, 1, 2, 3};
        System.out.println(numTimesAllBlue(flips));
    }
    public static int numTimesAllBlue(int[] flips) {
        int count = 0;//纪录次数
        int max = 0;//纪录遍历到i位置的最大值
        for (int i = 0; i < flips.length; i++) {
            if(flips[i] > max){
                max = flips[i];
            }
            if(max == i+1){//如果最大值，等于i索引加1则count+1
                count++;
            }
        }
        return count;
    }
}
