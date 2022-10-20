package com.leetcode.array.easy.fibonacciNo;

public class finonacciNo {
    public static int fib(int n) {
        int sum=0;
        int a=0;int b=1;
        if(n==1){
            sum=1;
        }
        for(int i=2;i<=n;i++){

            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = fib(4);
        System.out.print(result);
    }
}
