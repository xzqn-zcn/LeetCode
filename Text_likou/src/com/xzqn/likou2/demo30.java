package com.xzqn.likou2;

public class demo30 {
    //121. 买卖股票的最佳时机

    /*给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
    你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
    返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0
    */
    public static void main(String[] args) {
        int[] nums = {2, 4, 1};
        //int[] nums = {7, 1};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 2 && prices[0] > prices[1]) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(prices[i] - min, max);
            }
        }
        return max;
    }
}
