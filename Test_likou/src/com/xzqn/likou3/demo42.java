package com.xzqn.likou3;

import java.util.Arrays;

public class demo42 {

    /*
    * 面试题 16.01. 交换数字
编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。*/
    public static void main(String[] args) {

        int[] arr = {7, 10};
        System.out.println(Arrays.toString(swapNumbers(arr)));
    }

    public static int[] swapNumbers(int[] numbers) {

        numbers[1] = (numbers[0] - (numbers[0] = numbers[1])) + numbers[1];

        return numbers;
    }
}
