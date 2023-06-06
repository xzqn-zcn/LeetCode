package com.xzqn.likou4;

import java.util.ArrayList;
import java.util.List;

public class demo76 {
    /*
    * 605. 种花问题
    假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
    给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否
    * 在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false 。*/
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < flowerbed.length; i++) {
            list.add(flowerbed[i]);
        }
        list.add(0);
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) == 0 && list.get(i - 1) == 0 && list.get(i + 1) == 0) {
                list.set(i, 1);
                n--;
            }
        }
        return n <= 0;
    }
}
