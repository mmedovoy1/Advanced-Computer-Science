import java.util.Scanner;

public class Wolf extends Animal {
    private boolean isFull;
    private int eat;
    Scanner keyboard = new Scanner(System.in);
    private String name;
    int funFactNum;
    private String species;

    // constructors
    public Wolf() {
        this.isFull = false;
        this.eat = 0;
        System.out.println("What is the wolf's name? ");
        this.name = keyboard.nextLine();
        this.funFactNum = 0;
        System.out.println("What is the species of wolf?");
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
    public void feed() {
        System.out.println("What is the wolf's meal? ");
        String meal = keyboard.nextLine();
        while (!meal.equals("hare") || !meal.equals("deer") || !meal.equals("moose")) {
            System.out.println("Invalid, try again. What is the wolf's meal? ");
            meal = keyboard.nextLine();
        }
        if (meal.equals("hare")) {
            setEat(eat += 1);
        }
        if (meal.equals("deer")) {
            setEat(eat += 4);
        }
        if (meal.equals("moose")) {
            setEat(eat += 1);
        }
    }

    public void funFact() {
        if (getFunFactNum() == 0) {
            System.out.println("wolves can live up to 13 years");
        } else if (getFunFactNum() == 1) {
            System.out.println("wolves jaw power is 1,500 lbs per square inch");
        } else if (getFunFactNum() == 2) {
            System.out.println("wolves can consume as much as 20lbs in one feeding");
        } else {
            System.out.println("no more fun facts");
        }
        setFunFactNum(funFactNum += 1);
    }

    public String getScientificName() {
        return "Canis lupus";
    }

    public void makeNoise() {
        System.out.println("Awooooo");
    }

    public String getSpecies() {
        return species;
    }

    public String toString() {
        return "This wolf is called " + getName() + " and its scientific name is "
                + getScientificName();
    }

}
