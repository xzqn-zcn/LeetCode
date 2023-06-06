package com.xzqn.likou;

public class demo12 {
    /*给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

如果反转后整数超过 32 位的有符号整数的范围[−231,231− 1] ，就返回 0。

假设环境不允许存储 64 位整数（有符号或无符号）`

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/reverse-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
        System.out.println(reverse(-2147483648));
        System.out.println(reverse(1463847412));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-1563847412));
        System.out.println(reverse(-1463847412));
    }

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        StringBuilder s = new StringBuilder();
        String st = String.valueOf(x);
        if (x < 0) {
            String substring = st.substring(1);
            long a = Long.parseLong(substring);
            if (a > 2147483647) {
                return 0;
            }
            while (true) {
                s.append(a % 10);
                a = a / 10;
                if (a == 0) {
                    if (Long.parseLong(s.toString()) > 2147483647) {
                        return 0;
                    }
                    return -Integer.parseInt(s.toString());
                }
            }
        }
        if (st.length() > 10 || Long.parseLong(st) > 1463847412) {
            return 0;
        }
        while (true) {
            s.append(x % 10);
            x = x / 10;
            if (x == 0) {
                return Integer.parseInt(s.toString());
            }
        }
    }
}
