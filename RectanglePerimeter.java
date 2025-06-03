public class RectanglePerimeter {
    private double length;
    private double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Breadth: " + breadth);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(10, 5);
        rect.display();
    }
}
