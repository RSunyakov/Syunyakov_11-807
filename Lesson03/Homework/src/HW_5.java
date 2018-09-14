import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a count of numbers");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Please, enter a numbers");
        for (int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
        }
        String s = new String();
        for (int i = 0; i < n; i++) {
            s = s + a[i];
        }
        System.out.println(s);
    }
}
