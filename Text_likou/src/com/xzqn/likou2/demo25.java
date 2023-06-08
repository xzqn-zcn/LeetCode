package com.xzqn.likou2;

import java.util.Arrays;

public class demo25 {
    /*
    * 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,4,4,5,6,7] 在变化后可能得到：
若旋转 4 次，则可以得到 [4,5,6,7,0,1,4]
若旋转 7 次，则可以得到 [0,1,4,4,5,6,7]
注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。

给你一个可能存在 重复 元素值的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。

你必须尽可能减少整个过程的操作步骤。

作者：LeetCode
链接：https://leetcode.cn/leetbook/read/binary-search/xetw7g/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{0, 1, 4, 4, 5, 6, 7}));
    }

    public static int findMin(int[] nums) {
        int a = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < a) {
                a = nums[i];
            }
        }
        return a;
    }
}