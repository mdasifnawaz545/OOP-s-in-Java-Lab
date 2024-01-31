import java.util.Scanner;

public class Q3_2 {
    public static void main(String args[]) {
        int sum = 0, a = 0, b = 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number of Term : ");
        int n = scn.nextInt();
        System.out.printf("%d %d ",a,b);
        for (int i = 0; i < n; i++) {
            sum = a + b;
            System.out.printf("%d ", sum);
            a = b;
            b = sum;
        }
    }

}
