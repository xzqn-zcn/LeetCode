package com.xzqn.likou4;

public class demo65 {
    /*
    * 1832. 判断句子是否为全字母句
    全字母句 指包含英语字母表中每个字母至少一次的句子。
    给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。
    如果是，返回 true ；否则，返回 false 。*/
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (int i = 0; i < 26; i++) {
            if (!sentence.contains(String.valueOf((char) ('a' + i)))) {
                return false;
            }
        }
        return true;
    }
}
