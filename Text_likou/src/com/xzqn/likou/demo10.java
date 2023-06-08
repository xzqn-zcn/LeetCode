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
            return strs[0];//如果数组长度为1,直接返回0索引上的字符串
        }
        int min = strs[0].length();//用来记录数组中最短的内个字符串长度
        //遍历求出数组中最短字符串的长度
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }
        //用来记录index索引上的字符
        Set<Character> set = new HashSet<>();
        //用来拼接返回字符
        StringBuffer stringBuffer = new StringBuffer();
        //while循环的推出条件，小于字符串数组中最短字符串的长度
        int index = 0;

        while(index < min)
            //j控制数组的索引
            for (int j = 0; j < strs.length; j++) {
                //把j为索引上的字符串第index位上的字符添加到set中
                  set.add(strs[j].charAt(index));
                  //判断如果j == 数组长度减一说明到了数组末尾
                  if(j == strs.length - 1) {
                      //如果set集合长度为1说明数组中index索引上的字符都一样
                      if (set.size() == 1) {
                          stringBuffer.append(strs[j].charAt(index));//拼接
                          set.remove(strs[j].charAt(index));//删除记录的字符
                      }
                      index++;//字符索引++
                  }
        }
        return stringBuffer.toString();
    }
}
