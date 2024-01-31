import java.util.Scanner;

public class Q4_2 {
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
        int min=array[0],max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
            else if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("\n");
        System.out.println("Maximum Value = "+max);
        System.out.println("Minimum Value = "+min);
    }
}
