package com.xzqn.likou8;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author👤：小镇青年
 */
public class demo143 {
    /**
     * 剑指 Offer 50. 第一个只出现一次的字符
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     */
    public static void main(String[] args) {
        String s = "abaccdeff";
        System.out.println(firstUniqChar(s));
    }
    public static char firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character character : map.keySet()) {
            if(map.get(character) == 1){
                return character;
            }
        }
        return ' ';
    }
}
