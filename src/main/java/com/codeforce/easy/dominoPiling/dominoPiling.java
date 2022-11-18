package com.codeforce.easy.dominoPiling;

import java.util.Scanner;

public class dominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  m = sc.nextInt();
        int  n = sc.nextInt();
        int result=0;
        result = (m*n)/2;

        System.out.println(result);
    }
}
