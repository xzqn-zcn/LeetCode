package com.xzqn.likou8;

/**
 * @author 小镇青年
 */
public class Demo146 {
    /**
     * 55. 跳跃游戏
     * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
     *
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     *
     * 判断你是否能够到达最后一个下标。
     */
    public static void main(String[] args){
        int[] nums = {0,1};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        //如果数组长度小于等于1，表示此刻就在终点
        if(nums.length <= 1){
            return true;
        }
        //获取数组的第一位
        int max = nums[0];
        //遍历
        for (int i = 0; i < nums.length; i++) {
            //如果当前的可移动数加上数组索引大于等于数组长度说明能到达终点
            if(max + i >= nums.length){
                return true;
            }
            //可移动步数减1
            max--;
            //判断当前可移动步数与i索引上的哪个大
            max = Math.max(max, nums[i]);
            //如果小于等于0就不能移动了说明永远也无法到达终点了
            if(max <= 0){
                return false;
            }
        }
        return false;
    }
}
