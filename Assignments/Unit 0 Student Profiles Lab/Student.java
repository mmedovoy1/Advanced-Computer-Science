public class Student{
    public String name;
    public int grade;
    public String id;

    // constructors
    public Student(String name, int grade) {
        name = newName;
        grade = newGrade;
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
        return(name + "is in " + grade + "th" )
    }

    public boolean equals(Student other ) {
        return grade == other.grade;
    }

    public String generatedId() {
        return (int)((Math.random() * 7) + 2) + "" + (int)((Math.random() * 7) + 2) + "" + (int)((Math.random() * 7) + 2) + "" + (int)(Math.random() *10) + "" + (int)(Math.random() * 10) + "" + (int)(Math.random() * 10) + "" + (int)(Math.random() * 10) + "" + (int)(Math.random() * 7);
    }
}