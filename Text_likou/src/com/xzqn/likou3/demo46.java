package com.xzqn.likou3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo46 {
    /*
    * 面试题 17.10. 主要元素
    数组中占比超过一半的元素称之为主要元素。给你一个 整数 数组，找出其中的主要元素。
*   若没有，返回 -1 。请设计时间复杂度为 O(N) 、空间复杂度为 O(1) 的解决方案。*/
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) > nums.length / 2) {
                return integer;
            }
        }
        return -1;
    }
}
