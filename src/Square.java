public class Square extends Shape implements Resizeable {
    private double size;

    public Square() {
        this.size = 1.0;
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percen) {
        setSize(this.size * percen);
    }

    @Override
    double getArea() {
        double area = this.size * this.size;
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                " size=" + size +
                ", area = " + getArea() +
                '}';
    }
}
