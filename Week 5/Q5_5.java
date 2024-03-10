import java.util.Scanner;

class Grader {
    int score;

    Grader() {
    }

    void letterGrade(int grade) {
        if (grade >= 90 && grade <= 100)
            System.out.println("O  Grade");
        if (grade >= 80 && grade <= 90)
            System.out.println("E  Grade");
        if (grade >= 70 && grade <= 80)
            System.out.println("A Grade");
        if (grade >= 60 && grade <= 70)
            System.out.println("B Grade");
        if (grade >= 50 && grade <= 60)
            System.out.println("C Grade");
        if (grade >= 40 && grade <= 50)
            System.out.println("D Grade");
        if (grade <= 40)
            System.out.println("F Grade");
    }

}

public class Q5_5 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int score = scn.nextInt();
        if (score >= 0 && score <= 100) {
            Grader g = new Grader();
            g.letterGrade(score);
        }

    }
}
