class Number {
    int value;

    boolean iseven() {
        if (value % 2 == 0)
            return true;
        else
            return false;
    }

    boolean isPrime() {
        int count = 1;
        for (int i = 2; i <= value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        if (count == 2)
            return true;
        else
            return false;

    }

    boolean isPerfect() {
        if (value % 2 == 0)
            return true;
        else
            return false;
    }
    int factorial(){
        int fac=1;
        for (int i = value; i >= 1; i--) {
            fac*=i;
        }
        return fac;
    }
}

public class Q4_11 {
    public static void main(String args[]) {
        Number num = new Number();
        num.value = 7;
        System.out.println("Is Value is Even : " + num.iseven());
        System.out.println("Is Value is Prime : " + num.isPrime());
        System.out.println("Is Value is Perfect : " + num.isPerfect());
        System.out.println("Factorial : " + num.factorial());
    }
}
