public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect.setLength(3);
        rect.setWidth(4);

        rect2.setLength(12);
        rect2.setWidth(5);


        System.out.println(rect.toString());
        System.out.println(rect2.toString());


        System.out.println(rect.equals(rect2));

        System.out.println(rect.calculateArea());

        System.out.println(rect.calculatePerimeter());

        System.out.println(rect.calculateDiagonal());
    }
}
