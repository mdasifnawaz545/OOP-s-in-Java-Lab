import java.util.Scanner;

public class Q7_2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of terms : ");
        int n = scn.nextInt();
        int s = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < s - 1; k++) {
                System.err.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.err.print("*");

            }
            s--;
            System.out.print("\n");

        }
    }
}
