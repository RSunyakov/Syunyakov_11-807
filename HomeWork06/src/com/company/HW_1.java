package com.company;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a count of strings");
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        SortString(s);
        for (int i = 0; i < n; i++) {
            System.out.println(s[i] + " ");
        }
    }

    static String[] SortString(String[] s) {
        int n = s.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i].length() > s[j].length()) {
                    String buf = s[i];
                    s[i] = s[j];
                    s[j] = buf;
                }
            }
        }
        return s;
    }
}