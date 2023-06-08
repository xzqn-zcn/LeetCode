package com.xzqn.likou;

public class demo18 {
    /*
    326. 3 的幂
    给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
    整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x

    作者：LeetCode
    链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnsdi2/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int n = 2147483647;
        int a = 3;
        System.out.println(isPowerOfThree(n));
        System.out.println(isPowerOfThree(a));
    }

    public static boolean isPowerOfThree(int n) {

        long a = 9;
        while (true) {
            if (a >= n) {
                break;
            }
            a *= 3;
        }
        return a == n || n == 1 || n == 3;
    }
}
