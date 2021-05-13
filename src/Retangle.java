public class Retangle extends Shape implements Resizeable {
    private double width;
    private double height;

    public Retangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double percen) {
        setWidth(this.width * percen);
        setHeight(this.height * percen);
    }

    @Override
    double getArea() {
        double area = this.width * this.height;
        return area;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", height=" + height +
                ", area = " + getArea() +
                '}';
    }
}
