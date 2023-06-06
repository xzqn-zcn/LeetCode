package com.xzqn.likou5;

public class demo85 {
    /**
     * 盛最多水的容器
     * 给定一个长度为 n 的整数数组height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i])。
     * <p>
     * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
     * <p>
     * 返回容器可以储存的最大水量。
     * <p>
     * 说明：你不能倾斜容器。
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode.cn/leetbook/read/all-about-array/x96n4v/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int i, j;
        for (i = 0, j = height.length - 1; i < j; ) {
            max = Math.max((j - i) * Math.min(height[j], height[i]), max);
            if (height[i] > height[j]) {
                j--;
            } else if (height[i] < height[j]) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return max;
    }

}
