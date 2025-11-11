import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = keyboard.nextLine();
        System.out.println("What is your choice? ");
        String choice = keyboard.nextLine();
        int runs = 0;
        while (validateChoice(choice) == false && runs <= 3) {
            System.out.println("Invalid. What is your choice? ");
            choice = keyboard.nextLine();
            runs += 1;
        }
        if (validateChoice(choice) == false) {
            choice = generateRandomChoice();
            System.out.println("Choice has been randomly generated to " + choice + ".");
        }
        setPlayerValues(name, choice);
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock") && opponent.getChoice().equals("scissors")) {
            return true;
        } else if (player.getChoice().equals("paper") && opponent.getChoice().equals("rock")) {
            return true;
        } else if (player.getChoice().equals("scissors") && opponent.getChoice().equals("paper")) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (didPlayerWin() == true) {
            return player.getName() + " won!\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        String a = "== GAME RESULTS ==\n" + player.getName() + " chose " + player.getChoice() + ".";
        String b = "\nOpponent chose " + opponent.getChoice() + ".\n";
        return a + b + toString();
    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateRandomChoice() {
        int num = (int) (Math.random()) * (3) + 1;
        if (num == 1) {
            return "rock";
        } else if (num == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

}
