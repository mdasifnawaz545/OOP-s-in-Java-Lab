import java.util.Scanner;

public class Q3_8 {
    public static void main(String args[]) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.err.println("Enter the no. of elements - ");
        n = scn.nextInt();
        int array[] = new int[n]; // Used to declare an array
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        System.out.print("Elements are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Elements in Sorted Order are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }

    }
}
