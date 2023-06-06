package com.xzqn.likou3;

public class demo57 {
    /*
    * 2652. 倍数求和
    给你一个正整数 n ，请你计算在 [1，n] 范围内能被 3、5、7 整除的所有整数之和。
    返回一个整数，用于表示给定范围内所有满足约束条件的数字之和。*/
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
    }

    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
