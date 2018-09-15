import java.util.Scanner;
public class HW_6_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int reverse[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            reverse[i] = a[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(reverse[i]);
        }
    }
}
