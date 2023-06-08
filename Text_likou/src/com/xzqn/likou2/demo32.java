package com.xzqn.likou2;

import java.util.Arrays;

public class demo32 {
    /*
    LC. 两数之和 II - 输入有序数组
    给你一个下标从 1 开始的整数数组numbers ，该数组已按 非递减顺序排列，请你从数组中找出满足相加之和等于目标数target 的两个数。
    如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
    以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
    你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
    你所设计的解决方案必须只使用常量级的额外空间。
    */
    public static void main(String[] args) {
        int[] numbers = {2, 15, 7};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] == target - numbers[j]) {
                    return new int[]{j + 1, i + 1};
                }
            }
        }
        return null;
    }
}
