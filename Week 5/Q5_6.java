import java.util.Scanner;

class Commission {
    int sales;

    Commission(int sales) {
        this.sales = sales;
    }

    int commission(int c) {
        System.out.println("Commissions");
        return c;
    }
}

public class Q5_6 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Sales : ");
        int sales = scn.nextInt();
        if (sales > 0) {
            Commission c = new Commission(sales);
            c.commission(sales);
        } else
            System.out.println("Invalid Input");

    }
}
