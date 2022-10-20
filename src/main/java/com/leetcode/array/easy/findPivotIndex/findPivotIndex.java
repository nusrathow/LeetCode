package com.leetcode.array.easy.findPivotIndex;

public class findPivotIndex {
    public static int pivotIndex(int[] nums) {
        for(int p=0;p<nums.length;p++){
            int left=0;
            int right=0;
            for(int i=0;i<p;i++){
                left=left+nums[i];
            }
            for(int j=nums.length-1;j>p;j--){
                right=right+nums[j];
            }
            if(left==right){
                return p;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int result = pivotIndex(nums);
        System.out.print(result);
    }
}
