package com.xzqn.likou4;

import java.util.ArrayList;
import java.util.List;

public class demo74 {
    /*
    * 1431. 拥有最多糖果的孩子
    给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
    对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。*/
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];//该变量用来记录最大糖果的数量,初值为传入的数组0索引上的值
        for (int i = 1; i < candies.length; i++) {//索引从1开始，0以及作为max的初值
            max = Math.max(max, candies[i]);//循环比较并记录最多糖果数量
        }
        List<Boolean> list = new ArrayList<>();//用来记录返回值
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) { //如果i索引上的糖果加分配的糖果,大于等于最大糖果数量，则赋值为true，否则为false;
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
