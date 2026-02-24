public class Triangle extends Polygon {
    public double base;
    public double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        super(3);
        this.base = 3;
        this.height = 4;
    }

    public double getArea() {
        return getBase() * getHeight() / 2;
    }

    public String toString() {
        return super.toString() + "\nIt is a triangle with a base of " + getBase()
                + " and height of " + getHeight() + ". Its area is " + getArea() + ".";
    }
}
