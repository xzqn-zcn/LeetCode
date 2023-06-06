package com.xzqn.likou7;

public class demo130 {
    /**
     * 1492. n 的第 k 个因子
     * 给你两个正整数 n 和 k 。
     *
     * 如果正整数 i 满足 n % i == 0 ，那么我们就说正整数 i 是整数 n 的因子。
     *
     * 考虑整数 n 的所有因子，将它们 升序排列 。请你返回第 k 个因子。如果 n 的因子数少于 k ，请你返回 -1 。
     */
    public static void main(String[] args) {
        int n = 12, k = 3;
        System.out.println(kthFactor(n, k));
    }
    public static int kthFactor(int n, int k) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                count++;
                if(count == k){
                    return i;
                }
            }
        }
        return -1;
    }
}
