package com.xzqn.likou6;

public class demo104 {
    /**
     * 2544. 交替数字和
     * 给你一个正整数 n 。n 中的每一位数字都会按下述规则分配一个符号：
     * <p>
     * 最高有效位 上的数字分配到 正 号。
     * 剩余每位上数字的符号都与其相邻数字相反。
     * 返回所有数字及其对应符号的和。
     */
    public static void main(String[] args) {
        int n = 886996;
        System.out.println(alternateDigitSum(n));
    }

    public static int alternateDigitSum(int n) {
        //提示已经说明不会有负数，所以不用担心符号
        String str = String.valueOf(n);//转成字符串
        int sum = 0;//记录返回值
        for (int i = 0; i < str.length(); i++) {//遍历字符串
            if (i % 2 == 0) {//判断字符串是该+还是-, 索引取余2等于=0则+，否则-
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));//+=
            } else {
                sum -= Integer.parseInt(String.valueOf(str.charAt(i)));//-=
            }
        }
        return sum;
    }
}
