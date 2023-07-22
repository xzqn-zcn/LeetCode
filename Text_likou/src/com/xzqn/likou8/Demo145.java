package com.xzqn.likou8;

import java.util.*;

/**
 * @author 小镇青年
 */
public class Demo145 {
    /**
     * 860. 柠檬水找零
     * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
     * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
     * 注意，一开始你手头没有任何零钱。
     * 给你一个整数数组 bills ，其中 bills[i] 是第 i 位顾客付的账。如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
     */
    public static void main(String[] args) {
        int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        List<Integer> list = new ArrayList<>(2);
        //0位上存储的是5出现的次数，1位上的是10的次数
        list.add(0);
        list.add(0);
        for (int bill : bills) {
            switch (bill){
                case 5 :
                    list.set(0, list.get(0) +1);
                    break;
                case 10 :
                   list.set(1, list.get(1) + 1);
                   list.set(0, list.get(0) - 1);
                    if(list.get(0) < 0){
                        return false;
                    }
                    break;
                case 20:
                    if(list.get(1) > 0){
                        list.set(1, list.get(1) - 1);
                        list.set(0, list.get(0) - 1);
                    } else {
                        list.set(0, list.get(0) - 3);
                    }
                    if(list.get(0) < 0 || list.get(1) < 0){
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}
