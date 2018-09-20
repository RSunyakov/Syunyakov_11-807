package com.company;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please, enter a string");
        String s = sc.nextLine();
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if (str [i].equals(String.valueOf(0)) || str [i].equals(String.valueOf(1)) || str [i].equals(String.valueOf(2)) || str [i].equals(String.valueOf(3)) || str [i].equals(String.valueOf(4)) || str [i].equals(String.valueOf(5)) || str [i].equals(String.valueOf(6)) || str [i].equals(String.valueOf(7)) || str [i].equals(String.valueOf(8)) || str[i].equals(String.valueOf(9))) {
                str[i] = "*";
            }
        }
        s = String.join("", str);
        System.out.println(s);
    }
}
