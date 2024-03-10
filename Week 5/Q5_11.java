class Num {
    int integer = 15;

    void showNum() {
        System.out.println("Integer in Decimal = " + integer);
    }

}

class octNum extends Num {
    @Override
    void showNum() {
        System.out.println("Integer in Hexadecimal = " + Integer.toHexString(integer));
    }

}
public class Q5_11 {
    public static void main(String args[]) {
        Num n = new Num();
        octNum o = new octNum();
        n.showNum();
        o.showNum();

    }
}
