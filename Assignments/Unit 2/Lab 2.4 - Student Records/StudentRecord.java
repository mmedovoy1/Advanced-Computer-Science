public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // to-do: implement getTestScore

    public int getTestScore(int testNumber) {
        if (testNumber < scores.length && testNumber >= 0) {
            return scores[testNumber];
        } else {
            return -1;
        }
    }

    // inherited methods
    // to-do: implement toString
    public String toString() {
        String scoresToString = "[";
        for (int i = 0; i < scores.length; i++) {
            scoresToString += scores[i];
            if (i != (scores.length - 1)) {
                scoresToString += ", ";
            }
        }
        scoresToString += "]";
        return name + "'s scores: " + scoresToString;
    }

    public boolean equals(StudentRecord other) {
        int num = 0;
        if (this.scores.length == other.scores.length) {
            for (int i = 0; i < this.scores.length; i++) {
                if (this.scores[i] != other.scores[i]) {
                    num += 1;
                }
            }
        }
        if (num == 0 && this.name == other.name) {
            return true;
        } else {
            return false;
        }
    }

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores precondition: 0 <= first < last
     * < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        double sum = 0;
        double denom = 0;
        for (int i = first; i < last; i++) {
            sum += scores[i];
            denom += 1;
        }
        return sum / denom;
    }

    /*
     * Determines if each successive value in scores is greater than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        int num = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                num += 1;
            }
        }
        return num == 0;
    }

    /*
     * The method determines if the student has improved and returns the average score
     * appropriately: If the student has improved, returns the average of the top half of the scores
     * array. Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        double average = 0;
        if (hasImproved()) {
            average = getAverage(scores.length / 2, scores.length);
        } else {
            average = getAverage(0, scores.length);
        }
        return average;
    }

}
