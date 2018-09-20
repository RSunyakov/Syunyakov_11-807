package com.company;

import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a string");
        String s = sc.next();
        System.out.println("Please ,enter a (key)");
        String key = sc.next();
        char a[] = s.toCharArray();
        if (key.equals("u")) {
            for (int i = 0; i < s.length(); i++) {
                if (a[i] >= 97 & a[i] <= 122) {
                       int x = a[i] - 32;
                       a[i] = (char) x;
                }
            }
        }
        if (key.equals("l")) {
            for (int i = 0; i < s.length(); i++) {
                if (a[i] >= 65 & a[i] <= 90) {
                    int x = a[i] + 32;
                    a[i] = (char) x;
                }
            }
        }
        String out = new String(a);
        System.out.println(out);
    }
}