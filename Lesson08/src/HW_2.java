import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a N");
        int n = sc.nextInt();
        System.out.println("Please, enter a M");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int StrokSum = 0;
        int Strokmax = -32768;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (StrokSum > Strokmax) {
               Strokmax = StrokSum;
                StrokSum = 0;
               k = i - 1;
            }
            for (int j = 0; j < m; j++) {
                StrokSum += matrix[i][j];
            }
        }
        int StolbSum = 0;
        int maxStolb = -32768;
        int b = 0;
        for (int j = 0; j < m; j++) {
            if (StolbSum > maxStolb) {
                maxStolb = StrokSum;
                StolbSum = 0;
                b = j;
            }
            for (int i = 0; i < n; i++) {
                StolbSum += matrix[i][j];
            }
        }
        System.out.println("Max stroka: ");
        for (int j = 0; j < m; j++) {
            System.out.println(matrix[k][j]);
            }
        System.out.println("Max stolbec ");
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][b]);
        }
    }
}
