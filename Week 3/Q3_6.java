import java.util.Scanner;

public class Q3_6 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.err.println("Enter the three Numbers - ");
        int a, b, c;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        int max;
        if (a > b) {

            if (a > c) {
                max = a;

            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;

            } else {
                max = c;
            }
        }
        System.out.println("Maximum of " + a + ", " + b + " ," + c + " is " + max);
    }

}
