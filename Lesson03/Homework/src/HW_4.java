import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write a count of numbers");
        int n = sc.nextInt();
        int a[] = new int[n];
        int k = 0;
        System.out.println("Please, write a elements of array");
        a[0]=sc.nextInt();
        for (int i = 1; i < n ; i++) {
            a[i]=sc.nextInt();
            if (a[i]<a[i-1]&&i<(n+1)/2||a[i]>a[i-1]&&i>(n+1)/2) {
                k=-1;
                break;
            }
        }
        if(k == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }

}