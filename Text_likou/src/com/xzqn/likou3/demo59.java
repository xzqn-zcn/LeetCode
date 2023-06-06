package com.xzqn.likou3;

public class demo59 {
    /*
    * 2427. 公因子的数目
    给你两个正整数 a 和 b ，返回 a 和 b 的 公 因子的数目。
    如果 x 可以同时整除 a 和 b ，则认为 x 是 a 和 b 的一个 公因子 。*/
    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
    }

    public static int commonFactors(int a, int b) {
        int sum = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}

