public class Q7_1 {

    public static void main(String args[])
    {
        int array[]=new int[]{1,2,3,4,5};
        try{
            System.out.println(array[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Salaam...");
    }
}