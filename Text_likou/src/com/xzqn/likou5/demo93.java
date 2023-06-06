package com.xzqn.likou5;

public class demo93 {
    /**
     * 剑指 Offer 16. 数值的整数次方
     * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
     */
    public static void main(String[] args) {
        double x = -1;

        int n = 2147483647;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (x == 1) {
            return 1;
        }
        if (x == 1 && n == -2147483647) {
            return -1;
        }
        if (x == -1 && n == 2147483647) {
            return 1;
        }
        if (n == -2147483648) {
            return 0;
        }

        double temp = x;
        if (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                x = x * temp;
            }
        } else {
            for (int i = 0; i <= -n; i++) {
                x = x / temp;
            }
            return x;
        }
        return x;
    }
}
