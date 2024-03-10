class Num {
    int integer = 8;

    void showNum() {
        System.out.println("Integer in Deciaml = " + integer);
    }

}

class octNum extends Num {
    @Override
    void showNum() {
        System.out.println("Integer in Octal = " + Integer.toOctalString(integer));
    }

}
public class Q5_10 {
    public static void main(String args[]) {
        Num n = new Num();
        octNum o = new octNum();
        n.showNum();
        o.showNum();

    }
}
