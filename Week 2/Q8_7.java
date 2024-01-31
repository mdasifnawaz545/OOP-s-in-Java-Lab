import java.util.Scanner;

public class Q8_7 {
    public static void main(String args[])
    {
        int i,j;
                Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of terms : ");
        int n = scn.nextInt();
        for (int j2 = 0; j2 < n; j2++) {
            System.out.print("* ");
            
        }
        System.out.print("\n");
        for (int k = 2; k < 9; k++) {
            for (int k2 = 1; k2 < n; k2++) {
                if((k==k2)||(k+k2)==10||(k2-k)==8||(k+k2)==18||(k2-k)==16||(k+k2)==26){
                    System.out.print("* ");
                }
                else System.out.print("  ");
                
            }
            System.out.print("\n");
            
        }
        for (int k = 0; k < 25; k++) {
            System.out.print("* ");
            
        }
    }
    
}
