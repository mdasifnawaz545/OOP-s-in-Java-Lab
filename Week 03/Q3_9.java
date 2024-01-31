public class Q3_9 {
    static int count = 0;
    public Q3_9() {
        count++;
    }
    public static int cnt() {
        return count;
    }
    public static void main(String args[]) {
        Q3_9 o1 = new Q3_9();
        Q3_9 o2 = new Q3_9();
        System.out.printf("No of Objects - " + Q3_9.cnt());
    }
}