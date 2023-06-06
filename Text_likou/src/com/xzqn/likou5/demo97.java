package com.xzqn.likou5;


import java.util.List;

public class demo97 {

    /**
     * 2455. 可被三整除的偶数的平均值
     * 给你一个由正整数组成的整数数组 nums ，返回其中可被 3 整除的所有偶数的平均值。
     * <p>
     * 注意：n 个元素的平均值等于 n 个元素 求和 再除以 n ，结果 向下取整 到最接近的整数。
     * <p>
     * 。
     */
    public static void main(String[] args) {
        int[] nums = {4, 4, 9, 10};
        System.out.println(averageValue(nums));
    }

    public static int averageValue(int[] nums) {
        int count = 0;//用来记录可整除3的偶数的总和
        int index = 0;//用来记录可整除3的偶数的个数
        for (int num : nums) {
            if (num % 3 == 0 && num % 2 == 0) {//整除3:对3取余=0,偶数:对2取余=0
                count += num;
                index++;
            }
        }
        return count == 0 ? count : count / index;//三元判断,如果总和等于0返回总和,如果不等于0,返回总和除以个数的值
    }
}
