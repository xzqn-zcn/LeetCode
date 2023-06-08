package com.xzqn.likou7;

import java.util.*;

public class demo126 {
    /**
     * 2442. 反转之后不同整数的数目
     * 给你一个由 正 整数组成的数组 nums 。
     *
     * 你必须取出数组中的每个整数，反转其中每个数位，并将反转后得到的数字添加到数组的末尾。这一操作只针对 nums 中原有的整数执行。
     *
     * 返回结果数组中 不同 整数的数目。
     */
    public static void main(String[] args) {
        int[] nums = {89904,846787,965070,396570,847607,625317,851503,143414,954838,837423,988190,916423,771555,680073,575614,967207,965688};
        System.out.println(countDistinctIntegers(nums));
    }
    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            int num = 0;
            while(nums[i] > 0){
                num = (num * 10) +  nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
            set.add(num);
        }
        return set.size();
    }
}
