class Num {
    int integer = 15;

    void showNum() {
        System.out.println("Integer in Decimal = " + integer);
    }

}
class octHex extends Num {
    @Override
    void showNum() {
        System.out.println("Integer in Hexadecimal = " + Integer.toHexString(integer));
    }

}
class octNum extends Num {
    @Override
    void showNum() {
        System.out.println("Integer in Octal = " + Integer.toOctalString(integer));
    }

}
public class Q5_12 {
    public static void main(String args[]) {
        Num n = new Num();
        octNum o = new octNum();
        octHex h=new octHex();
        n.showNum();
        o.showNum();
        h.showNum();

    }
}
