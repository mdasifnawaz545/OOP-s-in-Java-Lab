import java.util.Scanner;

public class Q5_2 {
    public static void main(String args[]) {
        int array[] = new int[5]; // Used to declare an array
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        System.err.println("\n");
        System.out.println("Elements are : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(+array[j] + " ");
        }
        for (int i = 0; i < (array.length / 2); i++) {
            int temp;
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
        System.out.println("\n");
        System.out.println("Elements in Reverse are : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(+array[j] + " ");
        }
    }

}
