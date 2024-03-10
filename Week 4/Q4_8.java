class MyVolume {
    float length;
    float breadth;
    float height;
    float radius;

    int Volume(int side) {
        return side * side * side;
    }

    float Volume(float length, float breadth, float height) {
        return length * breadth * height;
    }

    float Volume(float radius) {
        return 4 / 3 * (3.14f * radius * radius);
    }
}

public class Q4_8 {
    public static void main(String args[]) {
        MyVolume vol = new MyVolume();
        System.out.println("Volume of Cube = " + vol.Volume(5));
        System.out.println("Volume of Cuboid = " + vol.Volume(5, 5, 5));
        System.out.println("Volume of Sphere = " + vol.Volume(5));

    }
}
