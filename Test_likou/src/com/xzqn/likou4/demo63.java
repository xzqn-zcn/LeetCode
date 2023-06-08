package com.xzqn.likou4;

import java.util.Arrays;

public class demo63 {
    /*
    * 2114. 句子中的最多单词数
    一个 句子 由一些 单词 以及它们之间的单个空格组成，句子的开头和结尾不会有多余空格。
    给你一个字符串数组 sentences ，其中 sentences[i] 表示单个 句子 。
    请你返回单个句子里 单词的最多数目 。*/
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));

    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        int a;
        for (int i = 0; i < sentences.length; i++) {
            a = sentences[i].split(" ").length;
            max = Math.max(a, max);
        }
        return max;
    }
}
