package com.xzqn.likou5;


import java.util.ArrayList;
import java.util.List;

public class demo94 {
    /**
     * 2446. 判断两个事件是否存在冲突
     * 给你两个字符串数组 event1 和 event2 ，表示发生在同一天的两个闭区间时间段事件，其中：
     * <p>
     * event1 = [startTime1, endTime1] 且
     * event2 = [startTime2, endTime2]
     * 事件的时间为有效的 24 小时制且按 HH:MM 格式给出。
     * <p>
     * 当两个事件存在某个非空的交集时（即，某些时刻是两个事件都包含的），则认为出现 冲突 。
     * <p>
     * 如果两个事件之间存在冲突，返回 true ；否则，返回 false 。
     */
    public static void main(String[] args) {
        String[] event1 = {"01:15", "02:00"}, event2 = {"02:00", "03:00"};
        System.out.println(haveConflict(event1, event2));
    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < event1.length; i++) {
            list.add(Integer.parseInt(event1[i].substring(0, 2)) * 60 + Integer.parseInt(event1[i].substring(3)));
            list.add(Integer.parseInt(event2[i].substring(0, 2)) * 60 + Integer.parseInt(event2[i].substring(3)));
        }
        if (list.get(1) >= list.get(0) && list.get(1) <= list.get(2) || list.get(3) >= list.get(0) && list.get(3) <= list.get(2)) {
            return true;
        }
        if (list.get(0) >= list.get(1) && list.get(0) <= list.get(3) || list.get(2) >= list.get(1) && list.get(2) <= list.get(3)) {
            return true;
        }
        return false;
    }
}
