import java.sql.SQLOutput;
import java.util.Scanner;

public class HW_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (pow2(a) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int pow2(double a) {
        if (a == 1) {
            return 1;
        } else {
            if (a > 1 && a < 2) {
                return 0;
            } else {
                return pow2(a / 2);
            }
        }
    }
}