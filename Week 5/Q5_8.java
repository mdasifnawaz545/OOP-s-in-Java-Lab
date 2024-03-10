class Building {
    int floor = 10;
    int room = 20;
    String footage = "NA";

    Building() {
        System.out.println("Building Class");
        System.out.println("No. of Floor : " + floor);
        System.out.println("No. of Room : " + room);
        System.out.println("Footage are " + footage);
    }

}

class House extends Building {
    int bedroom = 3;
    int bathroom = 2;

    House() {
        System.out.println("House Class");
        System.out.println("No. of Bedroom : " + bedroom);
        System.out.println("No. of Bathroom : " + bathroom);
    }

}

public class Q5_8 {
    public static void main(String args[]) {
        House h1 = new House();

    }
}
