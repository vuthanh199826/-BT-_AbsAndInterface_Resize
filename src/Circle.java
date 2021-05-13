public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    public void resize(double percen) {
        setRadius(this.radius * percen);
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", area = " + getArea() +
                '}';
    }
}
