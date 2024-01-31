import java.util.Scanner;

public class Q8_4 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of terms : ");
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
