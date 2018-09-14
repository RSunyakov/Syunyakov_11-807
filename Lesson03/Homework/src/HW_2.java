import java.util.Scanner;

import static java.lang.Math.abs;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a count of numbers");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Please, enter a numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (abs(a[i]) > abs(max)) {
                max = a[i];
            }
        }
        System.out.println("Maximum: " + max);
    }
}
