public class Player {
    private String name;
    private String choice;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        if (RPSGame.validateChoice(choice) == false) {
            this.choice = RPSGame.generateRandomChoice();
        }
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice.toLowerCase();
        if (RPSGame.validateChoice(this.choice) == false) {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }
}
