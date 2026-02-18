import java.util.Scanner;

public class Monkey extends Animal{
    private boolean isFull;
    private int eat;
    Scanner keyboard = new Scanner(System.in);
    private String name;
    int funFactNum;
    private String species;

    // constructors
    public Monkey() {
        this.isFull = false;
        this.eat = 0;
        System.out.println("What is the wolf's name? ");
        this.name = keyboard.nextLine();
        System.out.println("What is the species of monkey?");
        this.species = keyboard.nextLine();
    }

    // getters and setters
    public boolean isFull() {
        if (getEat() > 7) {
            setFull(true);
        } else {
            setFull(false);
        }
        return isFull;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    public int getEat() {
        return eat;
    }

    public void setEat(int eat) {
        this.eat = eat;
    }

    public Scanner getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFunFactNum() {
        return funFactNum;
    }

    public void setFunFactNum(int funFactNum) {
        this.funFactNum = funFactNum;
    }

    // methods
    public void eat() {
        System.out.println("What is the monkey's meal? ");
        String meal = keyboard.nextLine();
        while (!meal.equals("banana") || !meal.equals("insect") || !meal.equals("lizards")) {
            System.out.println("Invalid, try again. What is the monkey's meal? ");
            meal = keyboard.nextLine();
        }
        if (meal.equals("banana")) {
            setEat(eat += 2);
        }
        if (meal.equals("deer")) {
            setEat(eat += 3);
        }
        if (meal.equals("lizard")) {
            setEat(eat += 4);
        }
    }

    public void funFact() {
        if (getFunFactNum() == 0) {
            System.out.println("all monkeys have tails");
        } else if (getFunFactNum() == 1) {
            System.out.println("monkeys can laugh and cry");
        } else if (getFunFactNum() == 2) {
            System.out.println("monkeys were sent into space before humans");
        } else {
            System.out.println("no more fun facts");
        }
        setFunFactNum(funFactNum += 1);
    }

    public String getScientificName() {
        return "Cercopithecidae";
    }
    
    public void makeNoise() {
        System.out.println("oo oo aa aa");
    }

    public String getSpecies() {
        return species;
    }


}
