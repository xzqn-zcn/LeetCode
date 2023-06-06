package com.xzqn.likou6;

public class demo106 {
    /**
     * 342. 4的幂
     * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
     * <p>
     * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
     */
    public static void main(String[] args) {

        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1 || n == 4) {//n == 0 或者==4，返回true
            return true;
        }
        long temp = 4;//初始值
        while (true) {//循环
            temp *= 4;//temp = temp * 4
            if (temp == n) {//*后temp等于n返回true
                return true;
            }
            if (temp > n) { //大于n返回false
                return false;
            }
        }
    }
}
