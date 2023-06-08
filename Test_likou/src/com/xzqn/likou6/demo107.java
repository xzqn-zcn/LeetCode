package com.xzqn.likou6;

import java.util.HashMap;
import java.util.Map;

public class demo107 {
    /**
     * 1394. 找出数组中的幸运数  分数：1118
     * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
     *
     * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
     *
     * 如果数组中存在多个幸运数，只需返回 最大 的那个。
     * 如果数组中不含幸运数，则返回 -1 。
     */
    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = -1;
        for (int i : arr) {
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if(integer == map.get(integer) && integer > max){
                max = integer;
            }
        }
        return max;
    }
}
