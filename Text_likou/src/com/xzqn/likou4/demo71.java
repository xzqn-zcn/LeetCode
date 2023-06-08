package com.xzqn.likou4;

public class demo71 {
    /*
    * 面试题 01.09. 字符串轮转
    字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。*/
    public static void main(String[] args) {
        String s1 = "", s2 = "";
        System.out.println(isFlipedString(s1, s2));
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1 == null || s1.length() == 0) {
            return false;
        }
        if (s2 == null || s2.length() == 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                stringBuilder.append(s1.substring(i));
                stringBuilder.append(s1.substring(0, i));
                if (s2.contains(stringBuilder)) {
                    return true;
                }
                stringBuilder = new StringBuilder();
            }
        }
        return false;

        /*//大佬算法
        *  if (s1.length()!=s2.length()) return false;
	    String ss = s2+s2;
	    return ss.contains(s1);    */
    }
}
