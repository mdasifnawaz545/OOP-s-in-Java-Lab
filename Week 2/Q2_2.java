import java.util.Scanner;

public class Q2_2 {
    public static void main(String args[])
    {
        int array[]=new int[5]; //Used to declare an array
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i]=scn.nextInt();
        }
        System.out.println("Elements are : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(+array[j]+" ");
        }
    }
    
}
