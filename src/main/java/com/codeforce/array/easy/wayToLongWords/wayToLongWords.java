package com.codeforce.array.easy.wayToLongWords;

import java.util.Scanner;

public class wayToLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while (m-- > -1) {
            String value = scanner.nextLine();
            int l = value.length();
            if (l > 10) {
                System.out.print(value.charAt(0));
                System.out.print(l - 2);
                System.out.println(value.charAt(l - 1));

            } else {
                System.out.println(value);
            }
        }
    }
}
