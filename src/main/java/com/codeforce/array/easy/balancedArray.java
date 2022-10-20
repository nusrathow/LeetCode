package com.codeforce.array.easy;
import java.util.Arrays;
import java.util.Scanner;

public class balancedArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            sc.nextLine();
            int b=m;
            while(b-->0) {
                int t = sc.nextInt();
                sc.nextLine();
                System.out.print("");
                int[] numbers = new int[t];
                int even = 0;
                int odd = t / 2;
                int sum1 = 0, sum2 = 0;
                for (int i = 2; i <= t; i += 2) {
                    numbers[even] = numbers[even] + i;
                    sum1 = numbers[even] + sum1;
                    even++;
                }
                for (int i = 1; i < odd; i += 2) {
                    numbers[odd] = numbers[odd] + i;
                    sum2 = numbers[odd] + sum2;
                    odd++;
                }
                for (int i = 1; i < 10000000;i+=2) {
                    int temp = sum2;
                    sum2 = sum2 + i;
                    if (sum2 != sum1) {
                        sum2 = temp;
                    } else {
                        System.out.println("YES");
                        numbers[t - 1] = i;
                        System.out.println(Arrays.toString(numbers).replace("[", "")
                                .replace("]", "")
                                .replace(",", ""));
                        break;
                    }
                }
                if (sum2 != sum1) {
                    System.out.println("NO");
                }

            }
        }
    }
}



