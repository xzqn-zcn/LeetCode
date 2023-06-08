package com.xzqn.likou7;

public class demo127 {
    /**
     * 2414. 最长的字母序连续子字符串的长度
     * 字母序连续字符串 是由字母表中连续字母组成的字符串。换句话说，字符串 "abcdefghijklmnopqrstuvwxyz" 的任意子字符串都是 字母序连续字符串 。
     *
     * 例如，"abc" 是一个字母序连续字符串，而 "acb" 和 "za" 不是。
     * 给你一个仅由小写英文字母组成的字符串 s ，返回其 最长 的 字母序连续子字符串 的长度。
     */
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(longestContinuousSubstring(s));
    }
    public static int longestContinuousSubstring(String s) {
        int max = 1;
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i)+1 == s.charAt(i+1)){
                if(count <= 0){
                    count+=2;
                } else {
                    count++;
                }
                if(count > max){
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
