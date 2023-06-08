package com.xzqn.likou5;

public class demo96 {
    /**
     * 258. 各位相加
     * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
     */
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        if (num <= 9) {
            return num;
        }
        while (num > 9) {
            int temp = 0;
            for (int i = 0; i < String.valueOf(num).length(); i++) {
                char ch = String.valueOf(num).charAt(i);
                temp += Integer.parseInt(String.valueOf(ch));
            }
            num = temp;
        }
        return num;
    }
}
