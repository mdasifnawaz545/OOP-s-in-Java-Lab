class vehicle {
    int wheels=4;
   static float speed=100;
}

class car extends vehicle {
    int passenger=100;

}

class truck extends vehicle {
    float loadlimit=1000;

}

public class Q5_14 {
    public static void main(String args[]) {
        car c = new car();
        truck t = new truck();
        System.out.println("No of Passenger = " + c.passenger);
        System.out.println("No of Wheels = " + c.wheels);
        System.out.println("Car Speed = " + c.speed);
        System.out.println("No of Wheels = " + t.wheels);
        System.out.println("Truck Speed = " + t.speed);
        System.out.println("Load Limit = " + t.loadlimit);


    }
}
