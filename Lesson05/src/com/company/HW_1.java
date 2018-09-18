package com.company;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double res = 0;
        String op;
        String feel = "Yes";
        while (1 == 1) {
            if (feel.equals("Yes")) {
                a = sc.nextDouble();
            }
            if (feel.equals("No")) {
                a = res;
            }
            op = sc.next();
            b = sc.nextDouble();
            res = 0;
            if (op.equals("+")) {
                res = a + b;
            }
            if (op.equals("/")) {
                res = a / b;
            }
            if (op.equals("*")) {
                res = a * b;
            }
            if (op.equals("-")) {
                res = a - b;
            }
            System.out.println(res);
            feel = "";
            System.out.println("Сбросить результат? Type Yes or No");
            feel = sc.next();
        }
    }
}