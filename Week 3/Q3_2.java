import java.util.Scanner;

public class Q3_2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Student Name - ");
        String name = scn.nextLine();
        System.out.println();
        System.out.print("Enter the Marks : ");
        int mark = scn.nextInt();
        System.out.println();
        if (mark >= 60 && mark <= 70) {
            System.out.println("C Grade");
        }
      else  if (mark >= 50 && mark < 60) {
            System.out.println("B Grade");
        }
      else  if (mark >= 60 && mark < 70) {
            System.out.println("A Grade");
        }
       else if (mark >= 80 && mark < 90) {
            System.out.println("E Grade");
        }
       else if (mark >= 90 && mark <= 100) {
            System.out.println("O Grade");
        }
        else {
            System.out.println("D Grade");
        }

    }
}
