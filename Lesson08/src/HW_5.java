import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write a first count of rows");
        int FirstCountOfRows = sc.nextInt();
        System.out.println("Please, write a first count of collumns ");
        int FirstCountOfCollumns = sc.nextInt();
        int FirstMultiplier[][] = new int[FirstCountOfRows][FirstCountOfCollumns];
        for (int i = 0; i < FirstCountOfRows; i++) {
            for (int j = 0; j < FirstCountOfCollumns; j++) {
                FirstMultiplier[i][j] = sc.nextInt();
            }
        }
        System.out.println("Please, write a second count of rows (N)");
        int SecondCountOfRows = sc.nextInt();
        System.out.println("Please, write a second count of collumns (M)");
        int SecondCountOfCollumns = sc.nextInt();
        if (FirstCountOfCollumns != SecondCountOfRows) {
            System.out.println("Please, enter a correct array");
        }
        int SecondMultiplier[][] = new int[SecondCountOfRows][SecondCountOfCollumns];
        for (int i = 0; i < SecondCountOfRows; i++) {
            for (int j = 0; j < SecondCountOfCollumns; j++) {
                SecondMultiplier[i][j] = sc.nextInt();
            }
        }
        int SumOfArrayElement = 0;
        int ResultOfMultiplication[][] = new int[FirstCountOfRows][SecondCountOfCollumns];
        for (int i = 0; i < FirstCountOfRows; i++) {
            for (int j = 0; j < SecondCountOfCollumns; j++) {
                SumOfArrayElement = 0;
                for (int m = 0; m < SecondCountOfCollumns; m++) {
                    SumOfArrayElement = SumOfArrayElement + (FirstMultiplier[i][m] * SecondMultiplier[m][j]);
                }
                ResultOfMultiplication[i][j] = SumOfArrayElement;
            }
        }
        for (int i = 0; i < FirstCountOfRows; i++) {
            for (int j = 0; j < SecondCountOfCollumns; j++) {
                System.out.println(ResultOfMultiplication[i][j]);
            }
        }
    }
}
