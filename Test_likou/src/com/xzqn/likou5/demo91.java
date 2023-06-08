package com.xzqn.likou5;

public class demo91 {
    /**
     * 204. 计数质数
     * 给定整数 n ，返回 所有小于非负整数 n 的质数的数量 。
     * @param args
     */
    public static void main(String[] args) {
        int n = 500000;//25
        //埃氏筛算法
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        int count = 0;
        boolean[] flag = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!flag[i]) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    flag[j] = true;
                }
            }
        }
        return count;
    }
}
