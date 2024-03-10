import java.util.Scanner;

public class Q3_7 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int array[] = new int[10]; // Used to declare an array
        System.out.println("Enter 10 Elements - ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.err.println("No. of Even - "+even);
        System.err.println("No. of Odd - "+odd);
    }
}
