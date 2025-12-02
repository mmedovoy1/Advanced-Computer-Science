public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        enrolledStudents = new StudentRecord[maxEnrollment];
    }

    // getters
    // to-do: implement getters
    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    // setters
    // to-do: implement setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods

    // to-do: implement toString
    public String toString() {
        String toPrint = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            toPrint += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return toPrint;
    }

    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the student with the best
     * final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent
    public String findBestStudent() {
        StudentRecord bestStudent = enrolledStudents[0];
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > bestStudent.getFinalAverage()) {
                bestStudent = enrolledStudents[i];
            }
        }
        return bestStudent.getName();
    }

    /*
     * Iterates through the enrolledStudents array and returns the average of the specified test
     * number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage
    public double calculateTestAverage(int testNumber) {
        double sum = 0;
        int denom = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getTestScore(testNumber) >= 0) {
                sum += enrolledStudents[i].getTestScore(testNumber);
                denom += 1;
            }
        }
        return sum / denom;
    }

    public boolean isFull() {
        if (enrolledStudents[enrolledStudents.length - 1] != null) {
            return true;
        } else {
            return false;
        }
    }

    public void enrollStudent(StudentRecord student) {
        boolean availableSpot = false;
        int spotCount = 0;
        while (!availableSpot) {
            if (enrolledStudents[spotCount] == null) {
                availableSpot = true;
            } else {
                spotCount += 1;
            }
        }
        enrolledStudents[spotCount] = student;
    }

    public boolean dropStudent(StudentRecord student) {
        boolean isInStudentRecord = false;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null && student.equals(enrolledStudents[i])) {
                enrolledStudents[i] = null;
                isInStudentRecord = true;
            }
        }
        if (isInStudentRecord) {
            return true;
        } else {
            return false;
        }
    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count += 1;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] increased = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            increased[i] = enrolledStudents[i];
        }
        this.enrolledStudents = increased;
    }

}
