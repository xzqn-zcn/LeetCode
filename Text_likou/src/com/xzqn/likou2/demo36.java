package com.xzqn.likou2;

public class demo36 {
    /*
    * 58. 最后一个单词的长度
    给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
    单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。*/
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        s = s1[s1.length - 1].toString();
        return s.length();
    }
}
