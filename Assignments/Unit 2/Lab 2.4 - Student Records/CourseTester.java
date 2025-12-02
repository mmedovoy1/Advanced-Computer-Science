public class CourseTester {
    public static void main(String[] args) {
        int[] anascores = {90, 89, 91, 95};
        StudentRecord ana = new StudentRecord("Ana", anascores);
        System.out.println(ana.toString().equals("Ana's scores: [90, 89, 91, 95]"));
        System.out.println(ana.getAverage(0, 3) == 91.25);
        System.out.println(ana.getTestScore(1) == 89);
        Course biology = new Course("Biology", 30);
        biology.enrollStudent(ana);
        boolean dropped = biology.dropStudent(ana);
        System.out.println(dropped);

    }
}
