import java.util.*;

public class Q8_3 {
    public static void main(String args[]) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter No. of Terms : ");
        n = scn.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

}
