public class Q8_6 {
    public static void main(String[] args)
    {
        int i, j, k;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*     ");
            }
            for (k = 1; k <= 2 * (5 - i); k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 2; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (k = 1; k <= 2 * (5 - i); k++) {
                System.out.print("  ");
            }
            System.out.print("  ");
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
