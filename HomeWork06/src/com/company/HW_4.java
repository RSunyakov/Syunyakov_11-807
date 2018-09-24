package com.company;

import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write a counts of numbers in array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(UniqueElements(a));
    }
    static boolean UniqueElements (int[] a) {
        boolean unique = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] & i != j) {
                    unique = true;
                }
            }
        }
        return unique;
        }
    }
