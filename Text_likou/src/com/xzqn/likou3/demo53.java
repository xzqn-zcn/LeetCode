package com.xzqn.likou3;

public class demo53 {
    /*231. 2 的幂
给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。*/
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2147483646));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        long a = 2;
        while (true) {
            a *= 2;
            if (a > n) {
                return false;
            }
            if (a == n) {
                return true;
            }
        }
    }
}
