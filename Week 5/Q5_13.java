class Distance {
    int distance=60;
    int timeTaken;

    void travelTime() {

        timeTaken=60*distance;
        System.out.println("Time Taken to Travel " + distance + " miles distance is " + timeTaken+"s");
    }
}

class DistanceMKS extends Distance{
    void travelTime(){
        distance=100;
        timeTaken=100*distance;
        System.out.println("Time Taken to Travel " + distance + " miles distance is " + timeTaken+"s");
    }
}

public class Q5_13 {
    public static void main(String args[]) {
        Distance D1=new Distance();
        DistanceMKS D2=new DistanceMKS();
        D1.travelTime();
        D2.travelTime();
    }
}

