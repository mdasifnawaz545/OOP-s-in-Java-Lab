class Triangle {
    private float a, b, c;

    void set_Dim(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean is_Triangle() {
        if ((a * a) == ((b * b) + (c * c)))
            return true;
        else
            return false;
    }

    double find_area() {
        double area = (find_perimeter() * (find_perimeter() - a) * (find_perimeter() - b) * find_perimeter() - c);
        area = Math.sqrt(area);
        return area;

    }

    float find_perimeter() {
        return ((a + b + c) / 2);
    }

    void show() {
        System.out.println("Sides of the Triangle is : " + a + " " + b + " " + c);
        System.out.println("Is its a Triangle : " + is_Triangle());
        System.out.println("Perimeter of the Triangle is : " + find_perimeter());
        System.out.println("Area of the Triangle is : " + find_area());
    }
}

public class Q4_10 {
    public static void main(String args[]) {
        Triangle t = new Triangle();
        t.set_Dim(5, 3, 4);
        t.show();

    }
}
