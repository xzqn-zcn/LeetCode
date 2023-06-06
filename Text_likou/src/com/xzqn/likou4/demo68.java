package com.xzqn.likou4;

public class demo68 {
    /*
    * 3. 无重复字符的最长子串
    给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。*/
    public static void main(String[] args) {
        String s = "ddvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1 || s == null) {
            return 1;
        }
        int len = 0;
        int index = 0;
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        while (i < s.length()) {
            if (stringBuilder.indexOf(String.valueOf(chars[i])) == -1) {
                stringBuilder.append(chars[i]);
                i++;
            } else {
                len = Math.max(stringBuilder.length(), len);
                stringBuilder = new StringBuilder();
                index += 1;
                i = index;
            }
        }
        len = Math.max(stringBuilder.length(), len);
        return len;
    }
}
