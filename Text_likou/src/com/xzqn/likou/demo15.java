package com.xzqn.likou;

public class demo15 {
    /*
    387. 字符串中的第一个唯一字符
    给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。

     */
    public static void main(String[] args) {
        String s = "leetcode";
        String s2 = "llloveleetcode";
        String s3 = "dddccdbba";
        String s4 = "acaadcad";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar(s2));
        System.out.println(firstUniqChar(s3));
        System.out.println(firstUniqChar(s4));
    }

    public static int firstUniqChar(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        if (s.length() == 2 && chars[1] != chars[0]) {
            return 0;
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] != chars[j] && j == chars.length - 1) {
                    return i;
                } else if (chars[i] == chars[j] && i != j) {
                    break;
                } else if ((chars[i] != chars[j] && i == chars.length - 1 && j == chars.length - 2)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
