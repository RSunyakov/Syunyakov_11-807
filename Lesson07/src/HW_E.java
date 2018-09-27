import java.util.Scanner;

public class HW_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println(Sum(a = sc.nextInt()));
    }
    static int Sum(int a) {
        if (a < 10) {
            return a;
        } else {
            return a % 10 + Sum(a / 10);
        }
    }
}
