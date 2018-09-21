package com.company;

import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a string");
        String s = sc.next();
        System.out.println("Please ,enter a (key)");
        String key = sc.next();
        int code_of_a = 0;
        int code_of_z = 0;
        int register = 0;
        char a[] = s.toCharArray();
        if (key.equals("u")) {
            code_of_a = 97;
            code_of_z = 122;
            register = -32;
        }
        if (key.equals("l")) {
            code_of_a = 65;
            code_of_z = 90;
            register = 32;
        }
        for (int i = 0; i < s.length(); i++) {
            if (a[i] >= code_of_a & a[i] <= code_of_z) {
                int x = a[i] + register;
                a[i] = (char) x;
            }
        }
        String out = new String(a);
        System.out.println(out);
    }
}