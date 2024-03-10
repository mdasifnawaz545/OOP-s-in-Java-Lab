class Rectangle {
    float length;
    float breadth;

    float area() {
        return length * breadth;
    }

    float perimeter() {
        return 2 * (length + breadth);
    }

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Area of the Rectangle is = "+area());
        System.out.println("Perimeter of the Rectangle is = "+perimeter());
    }
}

public class Q4_6 {

    public static void main(String args[]) {
        Rectangle r=new Rectangle(5,5);
    }

}
