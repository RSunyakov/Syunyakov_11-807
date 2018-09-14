import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a count of numbers");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 1 ; i < (n - 1); i++) {
            if ((a[i] > a[i+1]) || (a[i] > a[i-1])) {
                k++;
            }
        }
        System.out.println(k);
    }
}
