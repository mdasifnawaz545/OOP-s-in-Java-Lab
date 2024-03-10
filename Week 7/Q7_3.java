class HandleNegativeNumber extends Exception {

    public String toString() {
        return "Caught the exception";
    }
}

class JavaClass {
    void ProcessInput(int n) throws HandleNegativeNumber {

        if (n < 0)
            throw new HandleNegativeNumber();

        else
            System.out.println(n * 2);

    }
}

public class Q7_3 {
    public static void main(String args[]) {
        JavaClass J = new JavaClass();
        try {
            J.ProcessInput(-4);
        } catch (HandleNegativeNumber h) {
            System.out.println(h);
        }

    }

}
