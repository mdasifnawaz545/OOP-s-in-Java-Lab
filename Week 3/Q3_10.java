import java.util.Scanner;

public class Q3_10 {

    public static void main(String args[]) {
        int index = 0, count = 1;
        int array[] = new int[10]; // Used to declare an array
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        System.err.println("\n");
        // System.out.println("Elements are : ");
        // for (int j = 0; j < array.length; j++) {
        // System.out.print(+array[j] + " ");
        // }
        for (int k = 0; k < array.length; k++) {
            count = 1;
            index = 0;
            for (int l = k + 1; l < array.length; l++) {
                if (array[k] == array[l]) {
                    count++;
                    index = k;
                }
            }
            if (count >= 2) {
                System.out.printf("%d Occured = %d Times\n", array[index], count);
            }

        }
    }
}
