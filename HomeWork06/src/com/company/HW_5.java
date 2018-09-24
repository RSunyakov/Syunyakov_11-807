package com.company;

import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a counts of number in first array");
        int n = sc.nextInt();
        System.out.println("Please, enter a count of number in second array");
        int k = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[k];
        System.out.println("Please, enter a first array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Please, enter a second array");
        for (int i = 0; i < k; i++) {
            b[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (a[i] == b[j]) {
                   count = count + 1;
        }
    }
        }
        System.out.println("For first array unique: " + (n - count));
        System.out.println("For second array unique: " + (k - count));
    }
}
