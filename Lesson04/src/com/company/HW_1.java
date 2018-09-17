package com.company;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write a count of numbers for first array");
        int length_1 = sc.nextInt();
        int a[] = new int [length_1];
        System.out.println("Please, write a numbers for first array ");
        for (int i = 0; i < length_1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Please, write a count of numbers for second array");
        int length_2 = sc.nextInt();
        int a_check[] = new int [length_2];
        System.out.println("Please, write a numbers for second array");
        for (int i = 0; i < length_2; i++) {
            a_check[i] = sc.nextInt();
        }
        int index_of_array = 0;
        boolean flag = true;
        for (int i = 0; i < length_1 & flag; i++) {
            for (int j = 0; j < length_2 & flag; i++) {
                if (a[i] == a_check[j]) {
                    index_of_array = i;
                    flag = false;
                }
            }
        }
        System.out.println(index_of_array);
    }
}
