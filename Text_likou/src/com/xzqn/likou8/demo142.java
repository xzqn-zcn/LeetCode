package com.xzqn.likou8;

/**
 * @author👤：小镇青年
 */
public class demo142 {
    /**2496. 数组中字符串的最大值
     * 一个由字母和数字组成的字符串的 值 定义如下：
     *
     * 如果字符串 只 包含数字，那么值为该字符串在 10 进制下的所表示的数字。
     * 否则，值为字符串的 长度 。
     * 给你一个字符串数组 strs ，每个字符串都只由字母和数字组成，请你返回 strs 中字符串的 最大值 。
     */
    public static void main(String[] args) {
       String[] strs = {"alic3","bob","3","4","00000"};
        System.out.println(maximumValue(strs));
    }
    public static int maximumValue(String[] strs) {
        //记录最大值
        int max = 0;
        for (String s : strs) {
            //使用try catch 如果转成Integer抛出错误,被抓取到,则转成获取该字符串的长度
            try {
                max = Math.max(max, Integer.parseInt(s));
            } catch ( Exception e){
                max = Math.max(max, s.length());
            }
        }
        return max;
    }
}
