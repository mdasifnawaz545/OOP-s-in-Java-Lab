import java.util.Scanner;

public class Q3_3 {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the Day no : ");
        int day=scn.nextInt();
        int x=(day%7);
        switch(x){
            case 0: System.err.println("Wednesday");
            break;
            case 1: System.err.println("Thursday");
            break;
            case 2: System.err.println("Friday");
            break;
            case 3: System.err.println("Saturday");
            break;
            case 4: System.err.println("Sunday");
            break;
            case 5: System.err.println("Monday");
            break;
            case 6: System.err.println("Tuesday");
            break;

        }

    }
}
