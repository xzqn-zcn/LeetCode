package com.xzqn.likou5;

import java.util.*;

public class demo81 {
    /**
     * 周赛题
     * 6430. 找出转圈游戏输家 显示英文描述
     * 通过的用户数68
     * 尝试过的用户数82
     * 用户总通过次数68
     * 用户总提交次数83
     * 题目难度Easy
     * n 个朋友在玩游戏。这些朋友坐成一个圈，按 顺时针方向 从 1 到 n 编号。从第 i 个朋友的位置开始顺时针移动 1 步会到达第 (i + 1) 个朋友的位置（1 <= i < n），而从第 n 个朋友的位置开始顺时针移动 1 步会回到第 1 个朋友的位置。
     * <p>
     * 游戏规则如下：
     * 第 1 个朋友接球。
     * 接着，第 1 个朋友将球传给距离他顺时针方向 k 步的朋友。
     * 然后，接球的朋友应该把球传给距离他顺时针方向 2 * k 步的朋友。
     * 接着，接球的朋友应该把球传给距离他顺时针方向 3 * k 步的朋友，以此类推。
     * 换句话说，在第 i 轮中持有球的那位朋友需要将球传递给距离他顺时针方向 i * k 步的朋友。
     * <p>
     * 当某个朋友第 2 次接到球时，游戏结束。
     * <p>
     * 在整场游戏中没有接到过球的朋友是 输家 。
     * <p>
     * 给你参与游戏的朋友数量 n 和一个整数 k ，请按升序排列返回包含所有输家编号的数组 answer 作为答案。
     */
    public static void main(String[] args) {
        int n = 2, k = 1;
        System.out.println(Arrays.toString(circularGameLosers(n, k)));
    }

    public static int[] circularGameLosers(int n, int k) {
        int[] arr = new int[n + 1];//人数加1,0索引不用
        int i = 1;//每次*的K步数
        int a = 0;//用来定义数组下标
        arr[1] = 1;//每次都是从第一位开始，所有第一位直接定义为已经接到过球
        int index = n - 1; ////用来记录数组中有多少个0，下面的程序中,
        while (true) {
            a += i * k; //a += 每次跨越步数*k，步数顺序为累加
            if (a + 1 > n) { // 得出的步数，加一，查看是否大于最大人数
                a %= n; //如果大于最大人数，最人数出去，得出应接球的下标
            }
            if (arr[a + 1] != 0) {//查看数组中，该下标是否接到过球，如果接到过，值为1,则跳出循环
                break;
            }
            arr[a + 1] = 1; //根据得出的下标，加+1, 因为0位不用所以加一， 然后索引上的值等于1
            index--;//数组每增加一个1， index则--
            i++;//然后要跨越的步数+1
        }
     /*   int index = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] == 0){
                index++;
            }
        }*/
        //根据获得的0的长度，然后创建数组
        int[] show = new int[index];
        index = 0;//用于伪造数组的索引
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == 0) {
                show[index] = j;
                index++;
            }
        }
        return show;
    }
}
