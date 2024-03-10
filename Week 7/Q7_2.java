public class Q7_2 {
    public static void main(String args[]) {
        int a = 100;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception ee) {
            System.out.println(ee);
        } finally {
            System.out.println("Caught an Error");
        }
        System.out.println("Salaam...");
    }

}
