package com.xzqn.likou4;

import java.util.Arrays;

public class demo70 {
    /*
    * 2575. 找出字符串的可整除数组
    给你一个下标从 0 开始的字符串 word ，长度为 n ，由从 0 到 9 的数字组成。另给你一个正整数 m 。
    word 的 可整除数组 div  是一个长度为 n 的整数数组，并满足：
    如果 word[0,...,i] 所表示的 数值 能被 m 整除，div[i] = 1
    否则，div[i] = 0
    返回 word 的可整除数组。*/
    public static void main(String[] args) {
        String word = "998244353";
        int m = 3;
        System.out.println(Arrays.toString(divisibilityArray(word, m)));

    }

    public static int[] divisibilityArray(String word, int m) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] arr = new int[word.length()];
        //TODO 找出字符串的可整除数组, 超出最大范围
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(word.charAt(i));
            long l = Long.parseUnsignedLong(String.valueOf(Long.parseLong(stringBuilder.toString())));
            if (l % m == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}
