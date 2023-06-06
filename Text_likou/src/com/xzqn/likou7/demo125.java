package com.xzqn.likou7;

public class demo125 {
    /**2348. 全 0 子数组的数目
     * 给你一个整数数组 nums ，返回全部为 0 的 子数组 数目。
     *
     * 子数组 是一个数组中一段连续非空元素组成的序列。
     */
    public static void main(String[] args) {
    int[] nums = {1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(nums));
    }
    public static long zeroFilledSubarray(int[] nums) {
        long sum = 0L;//记录总数
        long count = 0;//记录每段子数组最长0的个数
        for (int num : nums) {
            if(num == 0){//是0进入
                count++; //有一个0,count++一次
                sum += count;//加等于每段子数组0出现的次数
        } else{
                count =0;//有一次不为0则把count统计的0的个数重置
            }
    }
        return sum;
}
}
