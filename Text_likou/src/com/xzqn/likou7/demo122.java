package com.xzqn.likou7;

public class demo122 {
    /**
     * 2443. 反转之后的数字和
     * 给你一个 非负 整数 num 。如果存在某个 非负 整数 k 满足 k + reverse(k) = num  ，则返回 true ；否则，返回 false 。
     * reverse(k) 表示 k 反转每个数位后得到的数字。
     */
    public static void main(String[] args) {
        int num = 443;
        System.out.println(sumOfNumberAndReverse(num));
    }
    public static boolean sumOfNumberAndReverse(int num) {
       int sum;
       int count = 0;
        for (int i = num / 2; i < num; i++) {
               sum = i;
               while(true){
                  count = count * 10 + sum % 10;
                   sum = sum / 10;
                   if(sum <= 0){
                       break;
                   }
               }
                sum = i;
               if(sum + count == num){
                   break;
               }
               if(i == num - 1){
                   return false;
               }
               count = 0;
        }
        return true;
    }
}
