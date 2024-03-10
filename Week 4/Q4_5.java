import java.util.Scanner;

public class Q4_5 {
    static float area(float radius) {
        return 3.14f * radius * radius;
    }

    static float area(float base, float height) {
        return 0.5f * base * height;
    }

    static int area(int side) {
        return 4 * side;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        float radius, base, height;
        int side;
        float Carea, Tarea, Sarea;
        System.out.println("Enter the Radius of the Circle : ");
        radius = scn.nextFloat();
        System.out.println("Enter the Base and Height of the Triangle : ");
        base = scn.nextFloat();
        height = scn.nextFloat();
        System.out.println("Enter the Sides of the Square : ");
        side = scn.nextInt();
        Carea = area(radius);
        Tarea = area(base, height);
        Sarea = area(side);
        System.out.println("Area of Circle : " + Carea);
        System.out.println("Area of Triangle : " + Tarea);
        System.out.println("Area of Triangle : " + Sarea);

    }
}
