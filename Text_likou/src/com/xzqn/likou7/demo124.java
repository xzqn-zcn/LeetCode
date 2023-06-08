package com.xzqn.likou7;

public class demo124 {
    /**
     * 2109. 向字符串添加空格
     * 给你一个下标从 0 开始的字符串 s ，以及一个下标从 0 开始的整数数组 spaces 。
     *
     * 数组 spaces 描述原字符串中需要添加空格的下标。每个空格都应该插入到给定索引处的字符值 之前 。
     *
     * 例如，s = "EnjoyYourCoffee" 且 spaces = [5, 9] ，那么我们需要在 'Y' 和 'C' 之前添加空格，这两个字符分别位于下标 5 和下标 9 。因此，最终得到 "Enjoy Your Coffee" 。
     * 请你添加空格，并返回修改后的字符串。
     */
    public static void main(String[] args) {
       String s = "LeetcodeHelpsMeLearn";
       int[] spaces = {8,13,15};
        System.out.println(addSpaces(s, spaces));
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuffer stringBuffer = new StringBuffer(s);
        for (int i = spaces.length - 1; i >= 0; i--) {
            stringBuffer.insert(spaces[i], " ");
        }
        return stringBuffer.toString();
    }
}
