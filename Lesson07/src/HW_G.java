import java.util.Scanner;

public class HW_G {
    public static String LeftToRight(int n) {
        if (n < 10) {
            return n + "";
        } else {
            return LeftToRight(n / 10) + " " + n % 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(LeftToRight(n));
    }
}

