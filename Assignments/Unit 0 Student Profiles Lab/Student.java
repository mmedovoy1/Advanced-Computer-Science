public class Student {
    public String name;
    public int grade;
    public String id;

    // constructors
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generatedId();
        
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generatedId();
    }
    
    // getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    // setters
    public void setName(String input) {
        name = input;
    }

    public void setGrade(int input) {
        grade = input;
    }

    public void setId(String input) {
        id = input;
    }

    // methods
    public String toString() {
        return (name + " is a " + grade + "th grade student. Their id is " + id + ".");
    }

    public boolean equals(Student other) {
        return grade == other.grade;
    }

    public String generatedId() {
        return (int) ((Math.random() * 7) + 2) + "" + (int) ((Math.random() * 7)
            + 2) + "" + (int)  ((Math.random() * 7) + 2) + "-" + (int) (Math.random() * 10)
            + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10)
            + "" + (int) (Math.random() * 10);
    }
}