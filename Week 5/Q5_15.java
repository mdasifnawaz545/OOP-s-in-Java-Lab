import java.util.Scanner;

class twoDsheet {
    int length;
    int breadth;

    int cost() {
        return 40 * length * breadth;
    }

    twoDsheet(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("The Cost of 2D-Sheet of " + length + "X" + breadth + " is = " + cost());
    }
}

class threeDsheet {
    int length;
    int breadth;
    int height;

    int cost() {
        return 60 * length * breadth * height;
    }

    threeDsheet(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        System.out.println("The Cost of 3D-Sheet of " + length + "X" + breadth + "X" + breadth + " is = " + cost());
    }
}

public class Q5_15 {
    public static void main(String args[]) {
        int length, breadth;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length and breadth of the 2D sheet -");
        length = scn.nextInt();
        breadth = scn.nextInt();
        twoDsheet two = new twoDsheet(length, breadth);
        // threeDsheet three = new threeDsheet(5, 5, 5);
    }
}
