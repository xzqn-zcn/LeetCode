package com.xzqn.likou6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class demo116 {
    /**
     * 1460. 通过翻转子数组使两个数组相等
     * 给你两个长度相同的整数数组 target 和 arr 。每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。
     *
     * 如果你能让 arr 变得与 target 相同，返回 True；否则，返回 False 。
     */
    public static void main(String[] args) {
       int[] target = {1,2,3,4}, arr = {2,4,1,3};
        System.out.println(canBeEqual(target, arr));
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}
