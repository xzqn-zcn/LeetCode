package com.xzqn.likou5;

public class demo86 {
    /**
     * 剑指 Offer 05. 替换空格
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     */
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(String s) {
        char[] chars = s.toCharArray();//转换成char数组
        StringBuilder stringBuilder = new StringBuilder();//用于拼接，效率比String高
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {//判断i索引上的值是否等于空格，如果等于则进入拼接一个"%20"然后跳过此次循环
                stringBuilder.append("%20");
                continue;
            }
            stringBuilder.append(chars[i]);//如果上面等于空格的判断未通过，则拼接i索引上的字符
        }
        return stringBuilder.toString();//转换成字符串返回
    }
}
