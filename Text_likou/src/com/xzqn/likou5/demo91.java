package com.xzqn.likou5;

public class demo91 {
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
