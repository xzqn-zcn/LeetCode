package com.xzqn.likou3;

public class demo54 {
    /*
    * 507. 完美数
    对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
    给定一个 整数 n， 如果是完美数，返回 true；否则返回 false。*/
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num % 2 != 0) {
            return false;
        }
        int nums = 0;
        int i = 1;
        while (true) {
            if (i >= num) {
                break;
            }
            if (num % i == 0) {
                nums += i;
            }
            i++;
        }
        if (nums == num) {
            return true;
        } else {
            return false;
        }
    }
}
