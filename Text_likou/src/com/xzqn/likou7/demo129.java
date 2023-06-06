package com.xzqn.likou7;

public class demo129 {
    /**
     * 1456. 定长子串中元音的最大数目
     * 给你字符串 s 和整数 k 。
     *
     * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
     *
     * 英文中的 元音字母 为（a, e, i, o, u）。
     */
    public static void main(String[] args) {
       String s = "weallloveyou";
       int k = 3;
        System.out.println(maxVowels(s, k));
    }
    public static int maxVowels(String s, int k) {
        String str = "aeiou";
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(str.contains(String.valueOf(s.charAt(i)))){
                count++;
                if(count > max){
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return Math.min(max, k);
    }
}
