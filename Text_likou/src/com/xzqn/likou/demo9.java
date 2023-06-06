package com.xzqn.likou;


import java.util.Arrays;

public class demo9 {
    /*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        if (nums.length == 0 || nums.length == 1) {
            return;
        }

        for (int i = 0, j = 1; i < nums.length; i++) {
            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else if (j < nums.length - 1 && nums[i] == 0) {
                j++;
                i--;
            } else if (j < nums.length - 1) {
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

       /* int left = 0, right = 0;
        int length = nums.length;
        while (right < length){
            if (nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }*/



    /*    int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        if(count != 0) {
            for (int i = 0, j = nums.length - count - 1; i < j; i++, j--) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }*/
    /*    System.out.println(count);
        System.out.println(Arrays.toString(nums));
    }*/


    /*    int count = 0;
        int temp;
        for (int i = 0, j = nums.length - 1; i < j; i++) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    count++;
                    j--;
                }
                i--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - count; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));*/
