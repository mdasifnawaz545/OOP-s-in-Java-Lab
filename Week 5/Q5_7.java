class Staff {
    int code;
    String name;

    Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

class Teacher {
    int subject;
    String publication;

    Teacher(int subject, String publication) {
        this.subject = subject;
        this.publication = publication;
    }

    public int getSubject() {
        return subject;
    }

    public String getPublication() {
        return publication;
    }
}

class Officer {
    String grade;

    Officer(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

}

class StaffTypist {
    int speed;

    StaffTypist(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

class StaffCasualTypist {
    int daily_wages;

    StaffCasualTypist(int daily_wages) {
        this.daily_wages = daily_wages;
    }

    public int getDaily_wages() {
        return daily_wages;
    }

}

class StaffRegularTypist {
    int remuneration;

    StaffRegularTypist(int remuneration) {
        this.remuneration = remuneration;
    }

    public int getRemuneration() {
        return remuneration;
    }
}

public class Q5_7 {
    public static void main(String args[]) {
        Staff s = new Staff(1, "Staff 1");
        System.out.println(s.code);
        System.out.println(s.name);
    }
}
