public class Q5_4 {
    Q5_4(String name) {
        System.out.println("Parameterized Constructor");
        System.out.println("My Name is " + name);
    }

    Q5_4() {
        System.out.println("Non-Parameterized Constructor");
        System.out.println("My Name is MOHAMMAD ASIF NAWAZ");
    }

    public static void main(String args[]) {
        Q5_4 M1 = new Q5_4();
        Q5_4 M2 = new Q5_4("MOHAMMAD ASIF NAWAZ");

    }
}
