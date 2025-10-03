public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 12);
        Student student2 = new Student("Billy", 11);
        Student student3 = new Student("Joe");
        Student student4 = new Student("Jeff");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

        student1.setGrade(11);
        student2.setGrade(10);
        student3.setGrade(12);
        student4.setGrade(11);

        System.out.println("Testing setter methods: " + student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

        System.out.println("Are student 1 and student 3 in the same grade? " 
            + student1.equals(student3));

    }

}
