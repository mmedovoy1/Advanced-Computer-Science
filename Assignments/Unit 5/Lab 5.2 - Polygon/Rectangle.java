public class Rectangle extends Polygon {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super(4);
        this.width = 3;
        this.length = 4;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public String toString() {
        return super.toString() + "\nIt is a rectangle with a length of " + getLength()
                + " and width of " + getWidth() + ". Its area is " + getArea() + ".";
    }
}
