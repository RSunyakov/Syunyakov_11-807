package com.company;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number");
        String s = sc.next();
        char[] a = s.toCharArray();
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            n = n * 10 + a[i]-48;
        }
        System.out.print(n);
    }
}