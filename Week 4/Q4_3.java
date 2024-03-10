class Box {
    float length;
    float width;
    float height;

    float volume() {
        return length * height * width;
    }

    Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Volume of hte Box = " + volume());

    }

}

public class Q4_3 {
    public static void main(String args[]) {
        Box demo = new Box(5, 5, 5);
    }
}
