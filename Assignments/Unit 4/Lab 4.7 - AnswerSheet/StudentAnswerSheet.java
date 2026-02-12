import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    // constructors
    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException("neither name nor answers can be null");
        }
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    // methods

    public double getGrade(ArrayList<String> key) {
        if (key == null || key.size() != answers.size()) {
            throw new IllegalArgumentException("key.size() must be equal answers.size()");
        }
        double grade = 0.0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i) == key.get(i)) {
                grade += 1;
            } else if (!answers.get(i).equals("?")) {
                grade -= 0.25;
            }
        }
        return grade;
    }


}
