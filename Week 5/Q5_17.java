class Apple {
    void show() {
        System.out.println("Apple Class");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana Class");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry Class");
    }
}

public class Q5_17 {
    public static void main(String args[]) {
        Apple A = new Apple();
        Apple B = new Banana();
        Apple C = new Cherry();
        A.show();
        B.show();
        C.show();

    }
}
