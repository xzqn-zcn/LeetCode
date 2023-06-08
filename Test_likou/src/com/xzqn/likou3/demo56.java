package com.xzqn.likou3;

public class demo56 {
    /*
    * 1812. 判断国际象棋棋盘中一个格子的颜色
    给你一个坐标 coordinates ，它是一个字符串，表示国际象棋棋盘中一个格子的坐标。下图是国际象棋棋盘示意图。
    如果所给格子的颜色是白色，请你返回 true，如果是黑色，请返回 false 。
    给定坐标一定代表国际象棋棋盘上一个存在的格子。坐标第一个字符是字母，第二个字符是数字。*/
    public static void main(String[] args) {
        System.out.println(squareIsWhite("h3"));
    }

    public static boolean squareIsWhite(String coordinates) {
        char[] chars = coordinates.toCharArray();
        if (chars[0] == 'a' || chars[0] == 'c' || chars[0] == 'e' || chars[0] == 'g') {
            if (Integer.parseInt(String.valueOf(chars[1])) % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } else if (Integer.parseInt(String.valueOf(chars[1])) % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
