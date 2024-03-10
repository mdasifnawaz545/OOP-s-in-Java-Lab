class point {
    private float x, y, z;

    public point() {
        this.x = 1;
        this.y = 1;
        this.z = 1;
    }

    public point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    double find_distance() {
        double dis = Math.sqrt((x - 0) * (x - 0) * (y - 0) * (y - 0) * (z - 0) * (z - 0));
        return dis;
    }

    double find_distance(int x1, int y1, int z1) {
        double dis = Math.sqrt((x - x1) * (x - x1) * (y - y1) * (y - y1) * (z - z1) * (z - z1));
        return dis;
    }

    void show() {
        System.out.println("Axis is " + x + "- X axis " + y + " Y axis " + z + " Z axis");
        System.out.println("Distance of their Dimension form origin is " + find_distance());
        System.out.println("Distance of their Dimension form X1, Y1 and Z1 is " + find_distance(5, 5, 5));
    }
    // public point(point){

    // }
}

public class Q4_12 {
    public static void main(String args[]) {
        point p = new point();
p.show();
    }
}
