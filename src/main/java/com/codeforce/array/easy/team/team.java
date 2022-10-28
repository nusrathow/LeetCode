package com.codeforce.array.easy.team;

import java.util.Scanner;

public class team {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int  n = sc.nextInt();
            int countContest=0;

            int array[][] = new int[n][3];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < 3; j++){
                    array[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++){
                int count=0;
                for (int j = 0; j < 3; j++){
                    if(array[i][j]==1){
                        count++;
                    }
                }
                if(count>=2){
                    countContest++;
                }
            }
        System.out.println(countContest);
        }
}
