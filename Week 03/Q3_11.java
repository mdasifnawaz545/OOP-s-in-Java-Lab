import java.util.Scanner;

public class Q3_11 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int array[][] = new int[3][3];
        System.out.println("Enter Elements - ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scn.nextInt();
            }

        }
        System.out.println("Elements are - ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }
        int left = 0, right = 0;
        // For Diagonal in left

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    left = (left + array[i][j]);
                }
            }
        }

        // For Diagonal in Right

        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                if (i == j) {
                    right = (right + array[i][j]);
                }
            }
        }
        System.out.println("Right Element : " + right);
        System.out.println("Left Element : " + left);
    }
}
