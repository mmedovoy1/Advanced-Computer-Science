public class LineTester {
    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);
        Line pointLine = new Line(p1, p2);


        System.out.println("Finding Slope Using calculateSlope(): " + pointLine.calculateSlope());
        System.out.println("Finding Slope Using calculateSlopeFromPoints(): "
                + pointLine.calculateSlopeFromPoints());
        if (pointLine.calculateSlope() == pointLine.calculateSlopeFromPoints()) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        System.out.println("\np1.isCoordinateOnLine(): " + pointLine.isCoordinateOnLine(p1));
        System.out.println("p2.isCoordinateOnLine(): " + pointLine.isCoordinateOnLine(p2));
        System.out.println("p3.isCoordinateOnLine(): " + pointLine.isCoordinateOnLine(p3));
        System.out.println("p4.isCoordinateOnLine(): " + pointLine.isCoordinateOnLine(p4));

        System.out.println(pointLine.generatePointSlopeFormula());
    }
}
