package com.xzqn.likou7;

import java.util.Arrays;
import java.util.Date;

public class demo138 {
    /**
     * 1154. 一年中的第几天
     *给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。返回该日期是当年的第几天。
     */
    public static void main(String[] args) {
       String date = "2008-10-10";
        System.out.println(dayOfYear(date));
    }
    public static int dayOfYear(String date) {
        String[] arr = date.split("-");
        long y = Long.valueOf(arr[1]);
        int sum = 0;
            for (int i = 1; i < y; i++) {
                if(i == 4 || i == 6 || i == 9 || i == 11) {
                    sum += 30;
                } else if(i % 2 != 0 || i == 8 || i == 10 || i == 12){
                    sum +=31;
                }
                if(i == 2){
                    if(Long.valueOf(arr[0]) % 4 == 0 && Long.valueOf(arr[0]) % 100 != 0 || Long.valueOf(arr[0]) % 400 == 0){
                        sum += 29;
                    } else {
                        sum += 28;
                    }
                }
            }
        return sum += Integer.parseInt(arr[2]);
    }
}
