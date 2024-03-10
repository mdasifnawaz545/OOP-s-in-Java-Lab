class finalCheck {
    final static void check() {
        System.out.println("My Name is MOHAMMAD ASIF NAWAZ");
    }
}

class fnc extends finalCheck {
    @Override
    void check() {
        System.out.println("Not Possible to Change my name");
    }
}

public class Q6_2 {
    public static void main(String args[]) {
        finalCheck.check();

    }

}
