package com.xzqn.likou6;

public class demo108 {
    /**
     * 1662. 检查两个字符串数组是否相等 分数:1217
     * 提示
     * 给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
     *
     * 数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。
     */
    public static void main(String[] args) {
       String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int i = 0;
        int j = 0;
        while (true){
            if(i < word1.length){
                stringBuilder1.append(word1[i]);
                i++;
            }
            if(j < word2.length){
                stringBuilder2.append(word2[j]);
                j++;
            }
            if(i >= word1.length && j >= word2.length){
                break;
            }
        }
        return  stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
