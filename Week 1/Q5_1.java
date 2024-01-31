public class Q5_1 {
    public static void main(String args[]) {
        int n = 123, rev = 0, rem;
        System.out.println("Original Number is = " + n);
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse Number is = " +rev);
    }
}
