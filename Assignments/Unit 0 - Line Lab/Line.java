public class Line {
    public int a;
    public int b;
    public int c;

    // constructors
    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    // methods
    public double calculateSlope() {
        return (double) (-1 * (double) a / b);
    }

    public boolean isCoordinateOnLine(int x, int y) {
        return (a * x + b * y + c == 0);
    }

    public String toString() {
        return (a + "x + " + b + "y + " + c + " = 0");
    }

    public boolean equals(Line other) {
        return (a == other.a && b == other.b && c == other.c);
    }



}