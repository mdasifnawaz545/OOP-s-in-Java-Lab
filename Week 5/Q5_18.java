class Account {
    long ac_no;
    float bal_no;

    void input(long ac_no, float bal_no) {
        this.ac_no = ac_no;
        this.bal_no = bal_no;
    }

    void disp() {
        System.out.println("Account No = " + ac_no);
        System.out.println("Account Balance = " + bal_no);
    }

}

class Person extends Account {
    String name = "MOHAMMAD ASIF NAWAZ";
    long aadhar_no = 259952515356L;

    void disp() {
        System.out.println("Name = " + name);
        System.out.println("Aadhaar No = " + aadhar_no);
    }
}

public class Q5_18 {
    public static void main(String args[]) {
        Account A = new Account();
        A.input(575910110002581l, 0.00f);
        Person P = new Person();
        P.disp();
    }
}
