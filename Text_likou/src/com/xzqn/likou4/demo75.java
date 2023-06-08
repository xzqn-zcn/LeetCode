package com.xzqn.likou4;

import java.util.Arrays;

public class demo75 {
    /*
    1768. 交替合并字符串
    给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
    返回合并后的字符串 */
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;//记录word1的下标
        int j = 0;//记录word2的下标
        while (true) {
            if (i < word1.length()) {//如果i超出了word1的长度,则不再拼接word1的字符
                stringBuilder.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {//如果j超出了word2的长度,则不再拼接word2的字符
                stringBuilder.append(word2.charAt(j));
                j++;
            }
            if (i == word1.length() && j == word2.length()) {//如果i与j都不能再拼接，则跳出while循环
                break;
            }
        }
        return stringBuilder.toString();
    }
}
