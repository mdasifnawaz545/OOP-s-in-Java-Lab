class plate {
    int length;
    int width;

    plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Width = " + width);
        System.out.println("Length = " + length);
    }
}

class box extends plate {

    int height;

    box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Width = " + width);
        System.out.println("Length = " + length);
        System.out.println("Height = " + height);

    }
}

class woodbox extends box {
    int thick;

    woodbox(int length, int breadth, int height, int thick) {
        super(length, breadth, height);
        this.thick = thick;
        System.out.println("Width = " + width);
        System.out.println("Length = " + length);
        System.out.println("Height = " + height);
        System.out.println("Thickness = " + thick);
    }
}

public class Q5_16 {
    public static void main(String args[]) {
        plate p = new plate(5, 5);
        box b = new box(5, 5, 5);
        woodbox w = new woodbox(5, 5, 5, 5);
    }
}
