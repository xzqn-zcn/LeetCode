package com.xzqn.likou2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class demo33 {
    /*2418. 按身高排序
    给你一个字符串数组 names ，和一个由 互不相同 的正整数组成的数组 heights 。两个数组的长度均为 n 。
    对于每个下标 i，names[i] 和 heights[i] 表示第 i 个人的名字和身高。
    请按身高 降序 顺序返回对应的名字数组 names
    */

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        if (names.length > 1) {
            TreeMap<Integer, String> treeMap = new TreeMap();
            for (int i = 0; i < names.length; i++) {
                treeMap.put(heights[i], names[i]);
            }
            Set<Integer> integers = treeMap.keySet();
            int i = treeMap.size() - 1;
            for (Integer integer : integers) {
                names[i] = treeMap.get(integer);
            }
        }
        return names;
    }
}
