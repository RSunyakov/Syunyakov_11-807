package com.company;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split("");
        int step = sc.nextInt();
        step = step % str.length;
        for (int i = 1; i <= step; i++) {
            String tmp = str[str.length - 1];
            for (int j =str.length - 2; j > 1; j--) {
                str[j + 1] = str[j]; // на этой строчке массив выходит за предел, изменял кучу параметров, но массив все равно выходит. Если есть возможность, хотел бы посоветоваться почему.
            }
            str[1] = tmp;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}

