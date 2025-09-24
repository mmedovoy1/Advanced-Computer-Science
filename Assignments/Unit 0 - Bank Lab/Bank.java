public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    // constructors
    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    // getters
    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    // setters
    public void setNumberOfLoanOfficers(int input) {
        numberOfLoanOfficers = input;
    }

    public void setNumberOfTellers(int input) {
        numberOfTellers = input;
    }

    // methods
    public int computeTotalEmployees() {
        return (numberOfLoanOfficers + numberOfTellers);
    }

    public String toString() {
        return ("This bank has " + numberOfLoanOfficers 
            + " loan officers and " + numberOfTellers + " tellers.");
    }

    public boolean equals(Bank other) {
        return (numberOfLoanOfficers == other.numberOfLoanOfficers 
            && numberOfTellers == other.numberOfTellers);
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers = numberOfLoanOfficers + numberToHire;
        } else {
            numberOfTellers = numberOfTellers + numberToHire;
        }
    }

}