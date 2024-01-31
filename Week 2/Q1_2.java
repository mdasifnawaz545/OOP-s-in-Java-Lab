import java.util.Scanner;

public class Q1_2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Integer Number : ");
        int n = scn.nextInt();
        System.out.println("Enter the Float Number : ");
        float f = scn.nextFloat();
        scn.nextLine();
        System.out.println("Enter the String : ");
        String str = scn.nextLine();
        System.out.println("The Integer Number is = " + n);
        System.out.println("The Float Number is = " + f);
        System.out.println("The String is = " + str);
    }
}