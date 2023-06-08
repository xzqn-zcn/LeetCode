package com.xzqn.likou5;

public class demo99 {
    /**
     * 2586. 统计范围内的元音字符串数
     * 给你一个下标从 0 开始的字符串数组 words 和两个整数：left 和 right 。
     * <p>
     * 如果字符串以元音字母开头并以元音字母结尾，那么该字符串就是一个 元音字符串 ，其中元音字母是 'a'、'e'、'i'、'o'、'u' 。
     * <p>
     * 返回 words[i] 是元音字符串的数目，其中 i 在闭区间 [left, right] 内。
     */
    public static void main(String[] args) {
        String[] words = {"are", "amy", "u"};
        int left = 0, right = 2;
        System.out.println(vowelStrings(words, left, right));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        String str = "aeiou";//用来判断,字符串的第一个与最后一个字符是否在该字符串范围内
        int count = 0;//用来记录元音字符串的数量
        //遍历, 起点是left, 终点是right
        for (int i = left; i <= right; i++) {
            //判断第一个字符与最后一个字符是否是元音字符
            if (str.contains(words[i].charAt(0) + "") && str.contains(words[i].charAt(words[i].length() - 1) + "")) {
                count++;
            }
        }
        return count;
    }
}
