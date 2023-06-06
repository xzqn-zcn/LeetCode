package com.xzqn.likou2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo39 {
    /*
    * 125. 验证回文串
    如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
    字母和数字都属于字母数字字符。
    给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。*/
    public static void main(String[] args) {
        String s = " A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        //s的长度小于等于1直接返回true;
        if (s.length() <= 1) {
            return true;
        }
        //把字符串转成小写，并拆分成字符数组;
        char[] chars = s.toLowerCase().toCharArray();
        //遍历count用来做为通过判断的数字与字母存入数组的伪造索引;
        int count = 0;
        //遍历字符数组;
        for (int i = 0; i < chars.length; i++) {
            //判断是否是字母或数字，如果是就存入数组的第一位
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[count] = chars[i];
                count++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                chars[count] = chars[i];
                count++;
            }
        }
        //以变量count-1做为最后一位索引，然后变量并对比，如果其中有一次不一样直接返回false;
        for (int i = 0, j = count - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
