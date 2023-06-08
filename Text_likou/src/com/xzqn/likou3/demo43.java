package com.xzqn.likou3;

import java.util.Arrays;

public class demo43 {
    /*
    * 191. 位1的个数
编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。

 */
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        int i = Integer.bitCount(n);
        return i;


//        char[] chars = Integer.toBinaryString(n).toCharArray();
//        int count = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == '1'){
//                count++;
//            }
//        }
//        return count;
    }
}
