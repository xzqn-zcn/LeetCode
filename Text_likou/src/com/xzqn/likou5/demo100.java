package com.xzqn.likou5;

import java.util.*;

public class demo100 {
    /**
     * 面试题 01.02. 判定是否互为字符重排
     * 给定两个由小写字母组成的字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串
     */
    public static void main(String[] args) {
        String s1 = "abc", s2 = "bca";
        System.out.println(CheckPermutation(s1, s2));
    }

    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        for (int i = 0; i < chars1.length; i++) {
            if (chars[i] != chars1[i]) {
                return false;
            }
        }
        return true;
    }
}
