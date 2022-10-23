package com.codeforce.array.easy.watermelon;

import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            sc.nextLine();
            int count=0;
            if (m % 2 == 0) {
                for(int i=1;i<m;i++){
                    if(m%i==0){
                        count ++;
                    }
                }


                if(count>2){
                    System.out.print("YES");
                }
                else {
                    System.out.print("NO");
                }

            }
             else {
                System.out.print("NO");
            }

    }
}
