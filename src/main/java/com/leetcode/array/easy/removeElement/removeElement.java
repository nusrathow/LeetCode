package com.leetcode.array.easy.removeElement;

class removeElement {
    public static int removeElements(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;

            }
        }
        return j;
    }

    public static void main(String[] args) {
        int nums[] = {3,3,2,2,3,1,8,9,9};
        int val=3;
        int result = removeElements(nums,val);
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}
