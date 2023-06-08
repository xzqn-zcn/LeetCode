package com.xzqn.likou6;

public class demo112 {
    /**
     *
     1351. 统计有序矩阵中的负数 分数：1139
     给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 请你统计并返回 grid 中 负数 的数目。
     */
    public static void main(String[] args) {
        int[][] grid = {{-5,-5,-5}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if(grid[i][j] < 0){
                    count++;
                }else {
                 break;
                }
            }
        }
        return count;
    }
}
