package com.leetcode.array.easy.twoSum;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i= 0; i < nums.length-1; i++) {
            for (int j= i + 1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int target = 4;
        for(int x : twoSum(nums , target))
            System.out.print(x + " ");

    }
}
