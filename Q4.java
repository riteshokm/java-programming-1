
class Circle{
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}

public class Q4 {
    public static void main(String[] args) {

    }
}
