package com.xzqn.likou3;

public class demo60 {
    /*
    * 1684. 统计一致字符串的数目
给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。
* 如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
请你返回 words 数组中 一致字符串 的数目。*/
    public static void main(String[] args) {
        String allowed = "fstqyienx";
        String[] words = {"n", "eeitfns", "eqqqsfs", "i", "feniqis", "lhoa", "yqyitei", "sqtn", "kug", "z", "neqqis"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (!allowed.contains(String.valueOf(chars[j]))) {
                    break;
                }
                if (j == words[i].length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
