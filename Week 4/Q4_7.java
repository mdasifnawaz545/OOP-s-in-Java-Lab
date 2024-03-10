class Student {
    int roll;
    String name;
    int full_mark;
    int secured_mark;

    float CGPA(float f) {
        return f;
    }

    Student(int roll,String name,int full_mark,int secured_mark) {
        this.roll = roll;
        this.name = name;
        this.full_mark = full_mark;
        this.secured_mark = secured_mark;
        System.out.println("Studnet Roll Number : " + roll);
        System.out.println("Studnet Name : " + name);
        System.out.println("Studnet CGPA : " + CGPA(9.5f));

    }
}

public class Q4_7 {
    public static void main(String args[]) {
        Student S = new Student(22052736, "MOHAMMAD ASIF NAWAZ", 100, 95);

    }
}
