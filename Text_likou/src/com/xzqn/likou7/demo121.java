package com.xzqn.likou7;

import java.util.ArrayList;
import java.util.List;

public class demo121 {
    /**
     * 1324. 竖直打印单词
     * 给你一个字符串 s。请你按照单词在 s 中的出现顺序将它们全部竖直返回。
     * 单词应该以字符串列表的形式返回，必要时用空格补位，但输出尾部的空格需要删除（不允许尾随空格）。
     * 每个单词只能放在一列上，每一列中也只能有一个单词。
     */
    public static void main(String[] args) {
        String s = "CONTEST IS COMING";
        System.out.println(printVertically(s));
    }
    public static List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();//用来做返回用

        String[] str = s.split(" ");//以空格切割字符串

        StringBuilder stringBuilder = new StringBuilder();//用来拼接记录字符串

        int i = 0;//用来控制数组的索引

        int index = 0;//用来控制数组i处的字符串的索引

        while(true){

            if (str[i].length() > index) {//判断数组i处的字符串长度是否大于要拼接的索引
                stringBuilder.append(str[i].charAt(index));//如果大于进入拼接字符
            } else {
                stringBuilder.append(" ");//如果不大于进入else拼接空格
            }
            i++;//i++，拼接数组下个i处的index处的字符

            //判断如果i等于数组的长度，说明已经拼接到数组末尾了，进入if
            if(i == str.length){
                //跳出死循环的条件，如果拼接后的字符串去除前后空格，为空，说明已经没有字符可以拼接，跳出死循环返回结果
                if(stringBuilder.toString().trim().equals("")){
                    break;
                }
                //循环判断，如果最后一位是空格进入删除
                while(stringBuilder.charAt(stringBuilder.length() - 1) == ' '){
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
                //判断list添加
                    list.add(stringBuilder.toString());
                //把用来拼接的都清空
                stringBuilder = new StringBuilder();
                index++;//要拼接的字符索引+1
                i = 0;//i置于0，从头开始
            }
        }
        return list;
    }
}
