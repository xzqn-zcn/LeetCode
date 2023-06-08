package com.xzqn.likou3;

public class demo49 {
    /*168. Excel表列名称
给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称*/
    public static void main(String[] args) {
        int a = 52;
        System.out.println(convertToTitle(a));
        int b = 701;
        System.out.println(convertToTitle(b));
    }

    public static String convertToTitle(int columnNumber) {
        String[] str = {"0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String str1 = "";
        if (columnNumber <= 26) {
            str1 += str[columnNumber];
            return str1;
        }
        while (columnNumber > 26) {
            if (columnNumber % 26 == 0) {
                str1 = str[26] + str1;
            } else {
                str1 = str[columnNumber % 26] + str1;
            }
            if (columnNumber % 26 == 0) {
                str1 = str[1] + str1;
                return str1;
            }
            //TODO 未结束
            columnNumber = columnNumber / 26;
            str1 = str[columnNumber % 26] + str1;
        }
        return str1;
    }
}
