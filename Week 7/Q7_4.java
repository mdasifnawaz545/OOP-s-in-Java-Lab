class HrsException extends Exception {
    public String toString() {
        return "Hours is not greater than 24";
    }
}

class MinException extends Exception {
    public String toString() {
        return "Minute is not greater than 60";
    }
}

class SecException extends Exception {
    public String toString() {
        return "Second is not greater than 60";
    }
}

class Time {
    static int hours, minutes, second;

    static void userMethod(int hours, int minutes, int second) throws HrsException, MinException, SecException {

        if (hours > 24)
            throw new HrsException();
        else if (minutes > 60) {
            throw new MinException();
        } else if (second > 60) {
            throw new SecException();
        } else {
            System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + second);
        }

    }
}

public class Q7_4 {
    public static void main(String args[]) {

        try {
            Time.userMethod(4, 54, 54);
        } catch (HrsException h) {
            System.out.println(h);
        } catch (MinException m) {
            System.out.println(m);

        } catch (SecException s) {
            System.out.println(s);
        }
    }
}
