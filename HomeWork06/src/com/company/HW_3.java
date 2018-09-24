package com.company;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a count of numbers in array");
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = 0;
        int kmax = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                k = k + 1;
            } else {
                if (k > kmax) {
                    kmax = k;
                }
                k = 0;
            }
        }
        System.out.println(kmax + 1);
    }
}
