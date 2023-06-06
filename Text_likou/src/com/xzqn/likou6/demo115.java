package com.xzqn.likou6;

public class demo115 {
    /**
     * 1281. 整数的各位积和之差
     * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
     */
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int ride = 1;
        int sum = 0;
       while(n > 0){
           ride *= n % 10;
           sum += n % 10;
           n = n / 10;
       }
       return ride - sum;
    }
}
