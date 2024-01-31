import java.util.Scanner;

public class Q3_4 {
    public static void main(String args[]) {
        System.out.println("Enter Number - ");
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int rev = 0, rem;
        int x = n;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (x == rev) {
            System.out.println(+x + " is a Palindrome Number");

        } else {
            System.out.println(+x + " is not a Palindrome Number");

        }
    }
}
