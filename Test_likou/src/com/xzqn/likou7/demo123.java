package com.xzqn.likou7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class demo123 {
    /**
     * 2657. 找到两个数组的前缀公共数组
     * 给你两个下标从 0 开始长度为 n 的整数排列 A 和 B 。
     *
     * A 和 B 的 前缀公共数组 定义为数组 C ，其中 C[i] 是数组 A 和 B 到下标为 i 之前公共元素的数目。
     *
     * 请你返回 A 和 B 的 前缀公共数组 。
     *
     * 如果一个长度为 n 的数组包含 1 到 n 的元素恰好一次，我们称这个数组是一个长度为 n 的 排列 。
     */
    public static void main(String[] args) {
       int[] A = {2, 3, 1}, B = {3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr = new int[A.length];
      List<Integer> list = new ArrayList<>();
        for (int i : A) {
            list.add(i);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if(list.contains(B[j])){
                    arr[i]++;
                }
            }
            list.remove(list.size() - 1);
        }
        return arr;
    }
}
