package com.xzqn.likou;

import java.util.Arrays;

public class demo19 {
    /*
    给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    你可以假设除了整数 0 之外，这个整数不会以零开头。

    作者：LeetCode
    链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2cv1c/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;//对传入数组的最高位+1
        if (digits[digits.length - 1] >= 10) { //判断传入的数组最后一位加1后是否大于等于10
            int count = 0; //用来记录传入的数组所有索引上大于等于九的个数
            for (int i = 0; i < digits.length - 1; i++) {
                if (digits[i] < 9) { //判断传入的数组，如果有其中任意一位上的数小于9.直接跳出
                    break;
                } else {
                    count++; //如果大于或等于9就加1
                }
            }
            int[] arr;
            if (count == digits.length - 1) {//判断上面循环中大于九的数
                arr = new int[digits.length + 1]; //如果等于则把新建数组的长度+1
            } else {
                arr = new int[digits.length];//如果不相等，则不扩容数组
            }
            int index = arr.length - 1; //伪造新数组的最后一个索引
            for (int i = digits.length - 1; i >= 0; i--, index--) {
                if (digits[i] < 10) { //如果第i位上的数，小于10则直接放入新数组
                    arr[index] = digits[i];
                }
                if (digits[i] >= 10 && i != 0) {// i为上数大于等于10,且i不为0
                    arr[index] = digits[i] - 10; //把传入的数组的数减10装入新的数组中
                    digits[i - 1] += 1; //把传入的数组的i-1位上的数+1
                } else if (i == 0 && digits[i] >= 10) { //如果是老数组上的最后一个数，且大于10
                    arr[index - 1] = 1; //直接把新数组跳过一位加一
                }
            }
            return arr;//返回新数组
        }
        return digits;//如果传入的数组最后一位不等于10，直接返回传入的数组
    }
}
