package com.leetcode.array.easy.squaresOfSortedArray;

import java.util.Arrays;

public class squaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        for(int x : sortedSquares(nums))
            System.out.print(x + " ");

    }
}
