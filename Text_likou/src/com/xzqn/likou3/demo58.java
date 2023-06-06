package com.xzqn.likou3;

public class demo58 {
    /*
    * 剑指 Offer 64. 求1+2+…+n
    求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。*/
    public static void main(String[] args) {
        System.out.println(sumNums(9));
    }

    public static int sumNums(int n) {
        //递归
        int sum = 0;
        if (n <= 0) {
            return n;
        }
        sum += sumNums(n - 1) + n;
        return sum;
    }
}
