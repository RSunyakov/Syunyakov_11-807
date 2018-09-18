package com.company;


import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter a string");
            String s = sc.next();
        System.out.println("Please, enter start index");
            int n1 = sc.nextInt();
        System.out.println("Please, enter end index");
            int n2 = sc.nextInt();
            StringBuilder strResult = new StringBuilder(s);
            strResult.delete(n1,n2 + 1);
            System.out.println("strResult: " + strResult);
        }
}