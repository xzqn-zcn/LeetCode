package com.xzqn.likou3;

public class demo41 {
    /*实现 strStr()
    给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
    如果needle 不是 haystack 的一部分，则返回-1 。

    作者：LeetCode
    链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnr003/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
