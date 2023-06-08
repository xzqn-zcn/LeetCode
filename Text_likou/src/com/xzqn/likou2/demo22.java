package com.xzqn.likou2;

public class demo22 {
    /**
     * 给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
     * 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。
     * 不能使用任何内置的库函数，如sqrt 。
     * <p>
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode.cn/leetbook/read/binary-search/xel3tc/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        int num = 2000105819;
        int num1 = 2147483647;
        System.out.println(isPerfectSquare(num));
        System.out.println(isPerfectSquare(num1));
        System.out.println(isPerfectSquare(100));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(2000105819));
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);

    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        for (int j = num / 2; j > 0; j--) {
            if (j * j == num) {
                return true;
            }
        }
        return false;
    }
}
