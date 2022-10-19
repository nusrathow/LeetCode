package com.leetcode.array.easy.moveZeroes;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {


                int i = 0, j = 0;
                while(j< nums.length){
                    if(nums[j]==0){
                        j++;
                    }
                    else{
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        i++;
                        j++;
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
