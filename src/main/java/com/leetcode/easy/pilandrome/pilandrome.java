package com.leetcode.easy.pilandrome;

public class pilandrome {
        public boolean isPalindrome(int x) {
            int temp=x;
            int sum=0;
            int remainder=0;
            while(temp>0){
                remainder=temp%10;
                sum=(sum*10)+remainder;
                temp=temp/10;
            }
            return sum==x;
        }
}
