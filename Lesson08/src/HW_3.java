import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a count of rows");
        int m = sc.nextInt();
        System.out.println("Please, enter a count of collumns");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        // Заполнение контура
        int s = 1;
        for (int i = 0; i < n; i++) {
            matrix[0][i] = s;
            s++;
        }
        for (int j = 1; j < m; j++) {
            matrix[j][n-1] = s;
            s++;
        }
        for (int i = n - 2; i >= 0; i--) {
            matrix[m - 1][i] = s;
            s++;
        }
        for (int j = m - 2; j > 0; j--) {
            matrix[j][0] = s;
            s++;
        }
        int c = 1;
        int d = 1;
        while (s < m * n) {
            //Заполнение вправо внутри контура
            while (matrix[c][d + 1] ==0) {
                matrix[c][d] = s;
                s++;
                d++;
            }
            //Заполнение вниз внутри контура
            while (matrix[c + 1][d] == 0) {
                matrix[c][d] = s;
                s++;
                c++;
            }
            //Заполнение влево внутри контура
            while  (matrix[c][d - 1] == 0) {
                matrix[c][d] = s;
                s++;
                d--;
            }
            //Заполнение вверх внутри конура
            while (matrix[c - 1][d] == 0) {
                matrix[c][d] = s;
                s++;
                c--;
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (matrix[j][i] == 0) {
                    matrix[j][i] = s;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
