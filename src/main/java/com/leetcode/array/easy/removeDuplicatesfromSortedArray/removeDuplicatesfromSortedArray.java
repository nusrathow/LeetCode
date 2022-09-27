package com.leetcode.array.easy.removeDuplicatesfromSortedArray;

public class removeDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        //int arr[] = {1, 2, 2, 3, 4, 4, 5};
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}