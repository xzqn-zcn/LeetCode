package com.xzqn.likou3;

public class demo48 {
    /*
    * 面试题 17.04. 消失的数字
    数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
    注意：本题相对书上原题稍作改动。*/
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            n = n - nums[i] + i; //第一次遍历，n等于数组的长度-i索引上的值，加i，每次如此循环
        }
        return n;
    }
}
