package com.xzqn.likou3;

import java.util.HashSet;
import java.util.Set;

public class demo47 {
    /*
    * 面试题 01.01. 判定字符是否唯一
    实现一个算法，确定一个字符串 s 的所有字符是否全都不同。*/
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(isUnique(s));
    }

    public static boolean isUnique(String astr) {
        if (astr.length() == 0 || astr == null) {
            return true;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            set.add(astr.charAt(i));
        }

        return set.size() == astr.length() ? true : false;

    }
}
