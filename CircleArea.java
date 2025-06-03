public class CircleArea {
    private double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        CircleArea circle = new CircleArea(7.5);
        circle.display();
    }
}

