package com.xzqn.likou6;


import java.util.*;

public class demo120 {
    /**
     * 2150. 找出数组中的所有孤独数字
     * 给你一个整数数组 nums 。如果数字 x 在数组中仅出现 一次 ，且没有 相邻 数字（即，x + 1 和 x - 1）出现在数组中，则认为数字 x 是 孤独数字 。
     *
     * 返回 nums 中的 所有 孤独数字。你可以按 任何顺序 返回答案。
     */
    public static void main(String[] args) {
       int[] nums = {10,6,5,8};
        System.out.println(findLonely(nums));
    }
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num, map.get(num) +1);
            } else  {
                map.put(num, 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if(map.get(integer) < 2 && !map.containsKey(integer+1) && !map.containsKey(integer-1)){
                list.add(integer);
            }
        }
        return list;
    }
}
