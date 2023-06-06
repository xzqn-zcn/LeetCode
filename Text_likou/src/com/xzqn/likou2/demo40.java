package com.xzqn.likou2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo40 {
    /*
    * 题目：有效的字母异位词

给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。

作者：LeetCode
链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn96us/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != chars1[i]) {
                return false;
            }
        }
        return true;
    }
}



/*利用函数排序做
*  if(s.length() != t.length()){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        for (int i = 0; i < s.length(); i++) {
            if(chars[i] != chars1[i]){
                return false;
            }
        }
        return true;*/