package com.company;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        SpaceRemove(s);
        System.out.println(s);
    }
    static void SpaceRemove(String s){
        char [] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == 32) {
                s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
            }
        }
    }
}

