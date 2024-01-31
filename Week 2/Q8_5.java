public class Q8_5 {
    public static void main(String args[]) {
        int i, j, k;
        for (j = 1; j <= 17; j++) {
            System.out.print("* ");
        }
        System.out.println();
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (k = 1; k <= 9 - (2 * i); k++) {
                System.out.print("* ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }
            for (k = 1; k <= 9 - (2 * i); k++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i + 3; j++) {
                System.out.print("  ");
            }
            for (k = 1; k <= 11 - (2 * i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
