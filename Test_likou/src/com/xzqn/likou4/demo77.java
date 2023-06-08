package com.xzqn.likou4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo77 {
    /**
     * 263. 丑数
     * 丑数 就是只包含质因数 2、3 和 5 的正整数。
     * <p>
     * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
     */
    public static void main(String[] args) {
        System.out.println(isUgly(0));
    }

    public static boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
}
