public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        setChoice(choice.toLowerCase());
        if (RPSGame.validateChoice(this.choice) == false) {
            setChoice(RPSGame.generateRandomChoice());
        }
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice.toLowerCase();
        if (RPSGame.validateChoice(this.choice) == false) {
            choice = RPSGame.generateRandomChoice();
        }
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}
