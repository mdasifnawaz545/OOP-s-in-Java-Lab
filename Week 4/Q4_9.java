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

public class Q4_9 {
    public static void main(String args[]) {
        twoDsheet two = new twoDsheet(5, 5);
        threeDsheet three = new threeDsheet(5, 5, 5);
    }
}
