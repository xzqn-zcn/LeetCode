package com.xzqn.likou7;

public class demo128 {
    /**
     * 1550. 存在连续三个奇数的数组
     * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
     */
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;//用来记录连续计数的个数
        for (int i : arr) {
            if(i % 2 != 0){//取余2不等于0就是奇数
                count++;//记录连续奇数的个数

                if(count >= 3){//如果连续计数的个数大于等于3返回true
                    return true;
                }
                } else {//如果不是奇数，把记录的奇数个数清0
                count = 0;
            }
        }
        //如果走到最后直接返回false
        return false;
    }
}
