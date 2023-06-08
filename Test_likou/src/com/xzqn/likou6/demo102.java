package com.xzqn.likou6;

public class demo102 {
    /**
     * 1137. 第 N 个泰波那契数
     * 泰波那契序列 Tn 定义如下：
     * <p>
     * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
     * <p>
     * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
     */
    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacci(n));
    }

    public static int tribonacci(int n) {

        if (n == 0) {
            return n;
        }
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        for (int i = 1; i < n; i++) {
            int temp = arr[0] + arr[1] + arr[2];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        return arr[2];
    }
}
