package com.xzqn.likou;

import java.util.Stack;

public class demo20 {
    /*
    20. 有效的括号
    给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
    有效字符串需满足：

    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
    每个右括号都有一个对应的相同类型的左括号。

    来源：力扣（LeetCode）
    链接：https://leetcode.cn/problems/valid-parentheses
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        //TODO 判断是否是有效括号
        String str = "(((([]){}))){}";//true
        //String str = "({)}";//false
        //String str = "({{{{}}}))";//false
        String str1 = "[({(())}[()])]";//true
        //String str = "[({])}";//false
        System.out.println(isValid(str));
        // System.out.println(isValid(str1));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {//判断字符串的长度，如果是奇数一定是false
            return false;
        }
        Stack<Character> stack = new Stack<>();//栈,后进先出
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);//压入栈

            } else { //只有c== ')','}',']',这三种情况时进入

                if (stack.isEmpty()) {//判断栈是否为空，如果为空则没有数据，返回false
                    return false;
                }
                char ch = stack.pop();//弹栈,最后添加的数据，弹出的数据只可能是'(','{','[',

                if (ch == '(' && c != ')') {//检查弹出栈的数据,弹出是'('或'{'或'['其中之一,而如果c不是对应的另一半直接返回false
                    return false;
                }
                if (ch == '[' && c != ']') {
                    return false;
                }
                if (ch == '{' && c != '}') {
                    return false;
                }
            }
        }
        return stack.isEmpty();//检查栈是否为空，为空则true否则false;
    }
}
