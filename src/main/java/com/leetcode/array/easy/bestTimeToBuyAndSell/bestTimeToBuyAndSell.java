package com.leetcode.array.easy.bestTimeToBuyAndSell;

class bestTimeToBuyAndSell {
    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            min =Math.min(min,prices[i]);
            int sub=prices[i]-min;
            max=Math.max(max,sub);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int result = maxProfit(nums);
        System.out.print(result);
    }
}
