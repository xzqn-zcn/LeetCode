package com.xzqn.likou;


import java.util.*;

public class demo10 {
    /*
    14. 最长公共前缀

    编写一个函数来查找字符串数组中的最长公共前缀。

    如果不存在公共前缀，返回空字符串 ""。*/
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }
        Set<Character> set = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        int index = 0;
        while(index < min)
            for (int j = 0; j < strs.length; j++) {
                  set.add(strs[j].charAt(index));
                  if(j == strs.length - 1) {
                      if (set.size() == 1) {
                          stringBuffer.append(strs[j].charAt(index));
                          set.remove(strs[j].charAt(index));
                      }
                      index++;
                  }
        }
        return stringBuffer.toString();
    }
}
