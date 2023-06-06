package com.xzqn.likou7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo134 {
    /**
     * 2352. 相等行列对
     * 给你一个下标从 0 开始、大小为 n x n 的整数矩阵 grid ，返回满足 Ri 行和 Cj 列相等的行列对 (Ri, Cj) 的数目。
     * <p>
     * 如果行和列以相同的顺序包含相同的元素（即相等的数组），则认为二者是相等的
     */
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));
    }

    public static int equalPairs(int[][] grid) {
        List<Integer> list;
        int count = 0;
        int index = 0;
        int sum = 0;
        while (index < grid.length) {
            list = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                list.add(grid[index][i]);
            }
            int a = 0;
           while (a < grid.length) {
               for (int i = 0; i < grid.length; i++) {
                   if (list.get(i) == grid[i][a]) {
                       count++;
                       if (count == grid.length) {
                           sum++;
                       }
                   }
               }
               count = 0;
               a++;
           }
            index++;
        }
        return sum;
}
}
