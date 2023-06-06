package com.xzqn.likou4;

public class demo64 {
    /*
    * 2351. 第一个出现两次的字母
    给你一个由小写英文字母组成的字符串 s ，请你找出并返回第一个出现 两次 的字母。
    注意：
    如果 a 的 第二次 出现比 b 的 第二次 出现在字符串中的位置更靠前，则认为字母 a 在字母 b 之前出现两次。
    s 包含至少一个出现两次的字母。*/
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        int min = s.length();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.indexOf(s.charAt(i), i + 1) != -1) {
                min = Math.min(s.indexOf(s.charAt(i), i + 1), min);
            }
        }
        return s.charAt(min);
    }
}
