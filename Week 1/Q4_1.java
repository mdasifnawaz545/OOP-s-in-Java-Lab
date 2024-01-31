public class Q4_1 {
    public static void main(String args[])
    {
        int n=10,count=1;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(+n+" is a Prime Number");
        }
        else {
            System.out.println(+n+" is Not a Prime Number");
        }
    }
    
}
