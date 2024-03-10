import java.net.Socket;
import java.util.Scanner;

public class Q3_5 {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.printf("Enter First Name : ");
        String first=scn.nextLine();
        System.out.println();
        System.out.printf("Enter Last Name : ");
        String last=scn.nextLine();
        System.out.println();
        System.out.println(last+" "+first);
    }
    
}
