final class finalCheck{
    void meth1(){
        System.out.println("My Name is MOHAMMAD ASIF NAWAZ");
    }
}

class newClass extends finalCheck{
    System.out.println("Not Possible to extend a new class");
}
public class Q6_3 {
    public static void main(String args[])
    {
        System.out.println("My Name is MOHAMMAD ASIF NAWAZ");
        finalCheck f=new finalCheck();
        f.meth1();
    }
}
