package com.leetcode.array.easy.moveZeroes;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    if (i != j) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                    j ++;

                }
            }
        for (int element: nums) {
            System.out.print(element+" ");
        }

    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);

    }
}
