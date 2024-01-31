import java.util.Scanner;

public class Q8_2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of terms : ");
        int n = scn.nextInt();
        int s = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < s - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            for (int j = 0; j < i; j++) {
                System.out.print(" *");

            }
            for (int j = 0; j < s - 2; j++) {
                System.out.print("  ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            s--;
            System.out.print("\n");

        }
    }

}
