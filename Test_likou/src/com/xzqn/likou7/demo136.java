package com.xzqn.likou7;

import java.util.Arrays;

public class demo136 {
    /**
     * 2611. 老鼠和奶酪
     * 有两只老鼠和 n 块不同类型的奶酪，每块奶酪都只能被其中一只老鼠吃掉。
     *
     * 下标为 i 处的奶酪被吃掉的得分为：
     *
     * 如果第一只老鼠吃掉，则得分为 reward1[i] 。
     * 如果第二只老鼠吃掉，则得分为 reward2[i] 。
     * 给你一个正整数数组 reward1 ，一个正整数数组 reward2 ，和一个非负整数 k 。
     *
     * 请你返回第一只老鼠恰好吃掉 k 块奶酪的情况下，最大 得分为多少。
     * @param args
     */
    public static void main(String[] args) {
      int[] reward1 = {1,1,3,4}, reward2 = {4,4,1,1};
      int k = 2;
        System.out.println(miceAndCheese(reward1, reward2, k));
    }
    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int max = 0;//记录总数
        for (int i = 0; i < reward1.length; i++) {
            max += reward2[i];//记录reward2数组的总和
            reward1[i] -= reward2[i];
        }
        int a = reward1.length - 1;//用来记录要加排序后reward1数组的索引
        Arrays.sort(reward1);//对计算后的reward1进行排序，去最高的k个数
        for (int i = 0; i < k; i++) {
            max += reward1[a--];
        }
        return max;
    }
}
