class BoxDemo {
    double width, height, depth;

    BoxDemo(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume() {
        return width * height * depth;
    }
}

public class Box {
    public static void main(String[] args) {
        BoxDemo box = new BoxDemo(5, 4, 3);
        System.out.println("Volume of the box = " + box.getVolume());
    }
}