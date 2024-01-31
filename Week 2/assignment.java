import java.lang.*;
import java.util.*;

public class assignment {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter Name - ");
        String name = scn.nextLine();
        System.out.printf("Enter Roll - ");
        int roll = scn.nextInt();
        System.out.printf("Enter Section - ");
        String section = scn.nextLine();
        System.out.printf("Enter Branch - ");
        String branch = scn.nextLine();
        System.out.println(name);
        System.out.println(roll);
        System.out.println(section);
        System.out.println(branch);
    }

}