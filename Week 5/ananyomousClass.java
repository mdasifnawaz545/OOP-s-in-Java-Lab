interface inside {
    void display();
}

class Outer {
    int i = 786;
    void meth()
    {
        inside is = new inside() {
            public void display() {
                System.out.println(i);

            }
        };
        is.display();
    }
}

public class ananyomousClass {
    public static void main(String args[]) {
        Outer o=new Outer();
        o.meth();
    }
}
