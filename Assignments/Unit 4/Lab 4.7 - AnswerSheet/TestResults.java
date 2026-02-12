import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    // constructors
    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("ArrayLists should not be null.");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    // getters and setters

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    // methods

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        if (answerKey.size() != submissions.get(0).getAnswers().size()) {
            throw new IllegalArgumentException(
                    "answerKey.size() must be equal to submissions.size() and cannot be null");
        }

        for (StudentAnswerSheet student : submissions) {
            student.setTestScore(student.getGrade(answerKey));
        }
    }


    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        }

        int highest = 0;
        for (StudentAnswerSheet student : submissions) {
            if (student.getGrade(answerKey) > submissions.get(highest).getGrade(answerKey)) {
                highest = submissions.indexOf(student);
            }

        }

        return submissions.get(highest).getName();
    }



}
