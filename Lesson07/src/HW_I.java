import java.util.Scanner;

public class HW_I {
    public static void mult(int n, int i) {
        if (n % i == 0) {
            System.out.print(i);
            mult(n / i, i);
        } else if (n == 0 || i >= n / 2) {
            System.out.print(n);
            return;
        } else if (n % i != 0) {
            mult(n, i + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        mult(n, i);
    }
}
