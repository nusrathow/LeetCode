package com.leetcode.array.easy.majorityElement;

import java.util.Arrays;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int result = majorityElement(nums);
        System.out.print(result);
    }
}
