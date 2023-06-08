package com.xzqn.likou4;

import java.util.Arrays;

public class demo69 {
    /*2177. 找到和为给定整数的三个连续整数
       给你一个整数 num ，请你返回三个连续的整数，它们的 和 为 num 。如果 num 无法被表示成三个连续整数的和，请你返回一个 空 数组。*/
    public static void main(String[] args) {
        int num = 4;
        System.out.println(Arrays.toString(sumOfThree(num)));
    }

    public static long[] sumOfThree(long num) {
        long[] arr = new long[3];
        arr[1] = num / 3;//得出连续三个整数的中间数
        arr[0] = arr[1] - 1;//中间数减1是0索引上的
        arr[2] = arr[1] + 1;//中间数+1是2索引上的数
        if (arr[0] + arr[1] + arr[2] != num) { //三位数相加如果不等于传入的数，返回一个长度为0的数组
            return new long[0];
        }
        return arr;
    }
}
