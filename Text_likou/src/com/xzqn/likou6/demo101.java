package com.xzqn.likou6;

public class demo101 {

    /**
     * 斐波那契数（通常用F(n) 表示）形成的序列称为 斐波那契数列 。该数列由0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     * <p>
     * F(0) = 0，F(1)= 1
     * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
     * 给定n ，请计算 F(n) 。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/fibonacci-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }

    public static int fib(int n) {

        if (n == 0) {
            return n;
        }
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 3; i <= n; i++) {
            int temp = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        return arr[1];
    }
}
