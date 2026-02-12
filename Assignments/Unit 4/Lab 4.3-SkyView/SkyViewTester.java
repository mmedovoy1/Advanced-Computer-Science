public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned = {0.3, 0.7, 0.8, 1.1, 1.4, 0.4, 0.2, 0.5, 0.1, 0.9, 0.6, 1.6};
        SkyView view = new SkyView(4, 3, scanned);
        System.out.println(view.toString());
        System.out.println(view.getAverage(1, 2, 0, 1));
    }



}
