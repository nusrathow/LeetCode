package com.codeforce.array.easy.nextRound;

import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();


            int[]array1=new int[n];
            for(int i=0;i<n;i++){
                array1[i]=scanner.nextInt();
            }

            int score = array1[k-1];
            int count=0;


        for(int i=0;i<n;i++){
            if(array1[i]>=score && array1[i]!=0 ){
                count++;
            }
        }
        System.out.println(count);
    }
}
