public class Line {
    public int a;
    public int b;
    public int c;
    private Point p1;
    private Point p2;

    // constructors
    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY());
        this.b = p2.getX() - p1.getX();
        this.c = -(this.a * p1.getX() + p1.getY() * this.b);
    }

    // getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    // setters
    public void setA(int input) {
        a = input;
    }

    public void setB(int input) {
        b = input;
    }

    public void setC(int input) {
        c = input;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    // methods
    public double calculateSlope() {
        return (double) (-1 * (double) a / b);
    }

    public boolean isCoordinateOnLine(Point p) {
        return (a * p.getX() + b * p.getY() + c == 0);
    }

    public double calculateSlopeFromPoints() {
        return ((p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));
    }

    public String generatePointSlopeFormula() {
        int y1 = p1.getY();
        int x1 = p1.getX();
        double m = calculateSlopeFromPoints();
        return ("(y - " + y1 + ") = " + m + "(x - " + x1 + ")");
    }

    public String toString() {
        return (a + "x + " + b + "y + " + c);
    }

    public boolean equals(Line other) {
        return (a == other.a && b == other.b && c == other.c);
    }



}
