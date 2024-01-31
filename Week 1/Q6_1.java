public class Q6_1 {
    public static void main(String args[]) {
        int n = 121, rev = 0, rem;
        int x=n;
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
