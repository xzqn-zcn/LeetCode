package com.xzqn.likou6;

import java.util.Stack;

public class demo118 {
    /**
     * 921. 使括号有效的最少添加
     * 只有满足下面几点之一，括号字符串才是有效的：
     *
     * 它是一个空字符串，或者
     * 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
     * 它可以被写作 (A)，其中 A 是有效字符串。
     * 给定一个括号字符串 s ，在每一次操作中，你都可以在字符串的任何位置插入一个括号
     *
     * 例如，如果 s = "()))" ，你可以插入一个开始括号为 "(()))" 或结束括号为 "())))" 。
     * 返回 为使结果字符串 s 有效而必须添加的最少括号数。
     */
    public static void main(String[] args) {
        String str = "(())))";
        System.out.println(minAddToMakeValid(str));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == '('){
               stack1.push('(');
           } else if(!stack1.isEmpty()){
               stack1.pop();
           } else {
               count++;
           }
           }
       while (true){
           if(!stack1.isEmpty()){
               stack1.pop();
               count++;
           }
           if(stack1.isEmpty()){
               break;
           }
       }
           return count;
    }
}
