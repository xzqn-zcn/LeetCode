package com.xzqn.likou6;

public class demo105 {
    /**
     * 2520. 统计能整除数字的位数
     * 给你一个整数 num ，返回 num 中能整除 num 的数位的数目。
     * <p>
     * 如果满足 nums % val == 0 ，则认为整数 val 可以整除 nums 。
     */
    public static void main(String[] args) {

        System.out.println(countDigits(1248));
    }

    public static int countDigits(int num) {
        String str = String.valueOf(num);//把数字转成字符串
        int count = 0;//记录能整除的个数
        for (int i = 0; i < str.length(); i++) {//遍历字符串
            //num取余字符串中的每一位,如果等于0,则count++;
            if (num % Integer.parseInt(String.valueOf(str.charAt(i))) == 0) {
                count++;
            }
        }
        //返回count
        return count;
    }
}
