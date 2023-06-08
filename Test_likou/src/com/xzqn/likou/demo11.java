package com.xzqn.likou;

import java.util.Arrays;

public class demo11 {
    /*   给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。

       不占用额外内存空间能否做到？
       给定 matrix =
   [
     [1,2,3],
     [4,5,6],
     [7,8,9]
   ],

   原地旋转输入矩阵，使其变为:
   [
     [7,4,1],
     [8,5,2],
     [9,6,3]
   ]

   作者：LeetCode
   链接：https://leetcode.cn/leetbook/read/array-and-string/clpgd/
   来源：力扣（LeetCode）
   著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
       */
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[][] arr = {{1, 2, 3,4,5}, {4, 5, 6,7,8}, {7, 8, 9,10,11},{10,11,12,13,14},{13,14,15,16,17}};
        //int[][] arr = { {5, 1, 9,11},{ 2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
        //       7,4,1   8,5,2   9,6,3
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {
        int temp = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[j][i] != matrix[i][j]) {
                    temp = matrix[j][i]; //交换位置
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            temp = matrix[i][matrix.length - 1];
            matrix[i][matrix.length - 1] = matrix[i][0];
            matrix[i][0] = temp;

            //if (matrix.length % 2 == 0) {
            for (int j = 1; j < matrix[i].length - 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][j + 1];
                matrix[i][j + 1] = temp;
                // }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }

    }
}
