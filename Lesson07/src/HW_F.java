import java.util.Scanner;

public class HW_F {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println(soutLeftToRight(a = sc.nextInt()));
    }
    static int soutLeftToRight(int a){
        if (a < 10) {
            return a;
        } else {
            System.out.print(a % 10 + " ");
            return soutLeftToRight(a / 10);
        }
    }
}
