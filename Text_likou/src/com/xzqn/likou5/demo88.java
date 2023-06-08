package com.xzqn.likou5;

import java.util.Arrays;

public class demo88 {
    /**
     * 389. 找不同
     * 给定两个字符串 s 和 t ，它们只包含小写字母。
     * <p>
     * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
     * <p>
     * 请找出在 t 中被添加的字母。
     */
    public static void main(String[] args) {

    }

    public char findTheDifference(String s, String t) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (true) {
            if (i < s.length()) {
                count ^= s.charAt(i);
                i++;
            }
            if (j < t.length()) {
                count ^= t.charAt(j);
                j++;
            }
            if (i == s.length() && j == t.length()) {
                break;
            }
        }
        return (char) count;
    }
}
