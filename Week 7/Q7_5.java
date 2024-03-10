import java.util.Scanner;

class CheckArgument extends Exception {
    public String toString() {
        return "Check Argument";
    }

}

public class Q7_5 {
    public static void main(String args[]) {
        System.out.print("Enter the Number size : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a;
        int array[] = new int[n];
        System.out.println();
        System.out.print("Enter Element :");
        for (int i = 0; i < n; i++) {
            a = scn.nextInt();
            array[i] = a;
        }
        System.out.println();
        try {
            if (n < 4)
                throw new CheckArgument();
            int sum = 0;
            for (int string : array) {
                sum = sum + (string) * (string);
            }
            System.out.println(sum);
        } catch (CheckArgument c) {
            System.out.println(c);
        }

    }
}
