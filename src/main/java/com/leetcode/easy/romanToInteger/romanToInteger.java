package com.leetcode.easy.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {

        public static int romanToInt(String s) {
            Map<Character,Integer> romanInt = new HashMap<>();
            romanInt.put('I',1);
            romanInt.put('V',5);
            romanInt.put('X',10);
            romanInt.put('L',50);
            romanInt.put('C',100);
            romanInt.put('D',500);
            romanInt.put('M',1000);

            int num =romanInt.get(s.charAt(s.length()-1));

            for (int i = s.length()-2; i >= 0; i--) {
                if (romanInt.get(s.charAt(i)) < romanInt.get(s.charAt(i + 1))) {
                    num = num - romanInt.get(s.charAt(i));
                } else {
                    num = num + romanInt.get(s.charAt(i));
                }
            }
            return num;
        }
    public static void main(String[] args) {
        int result = romanToInt("MCMXCIV");
        System.out.print(result);
    }


}
