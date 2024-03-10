public class Q5_1 {
    public static void main(String args[]) {
        int A[] = { 1, 4, 6 };
        int B[] = { 8, 9 };

        int C[] = new int[A.length + B.length];
        int count = 0;
        System.out.print("Elements of A = ");
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Elements of B = ");

        for (int i : B) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Elements of C = ");
        for (int i : A) {
            System.out.print(i + " ");
        }
        for (int i : B) {
            System.out.print(i + " ");
        }

    }
}