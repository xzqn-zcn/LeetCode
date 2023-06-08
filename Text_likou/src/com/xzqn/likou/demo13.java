package com.xzqn.likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class demo13 {
    public static void main(String[] args) {
        /*
        26. 删除有序数组中的重复项
        给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
        由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，
        那么nums的前 k 个元素应该保存最终结果。
        将最终结果插入nums 的前 k 个位置后返回 k 。
        不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
        作者：LeetCode
        链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2gy9m/
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
        int[] arr = {1, 1, 1, 1, 2, 2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != null) {
                if (list.get(i).equals(list.get(i + 1))) {
                    list.set(i, null);
                }
            }
        }
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                nums[index] = list.get(i);
                index++;
            }
        }
        return index;
    }
}
