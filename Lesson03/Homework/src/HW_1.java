import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number of students");
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = 0;
        int s = 0;
        System.out.println("Please, enter a height of students");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            k++;
            s += a[i];
        }
        int sr = s / k;
        System.out.println ("Height, which is more than average height");
        for (int i = 0; i < n; i++) {
            if (a[i] > sr) {
                System.out.println(a[i]);
            }
        }
    }
}

