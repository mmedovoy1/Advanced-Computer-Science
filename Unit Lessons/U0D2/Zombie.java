public class Zombie {
    // instance variables (attributes)
    // green
    String skinColor = "Green";
    // rot and dead
    boolean isDead = true;

    // humans eaten count 
    int humansEaten = 0;

    // main
    public static void main(String[] args) {
        Zombie phillip = new Zombie();

        System.out.println(phillip.growl());
        System.out.println("Phillip ate "+ + phillip.humansEaten() + " humans");

        Zombie brian = new Zombie();

        System.out.println(brian.growl());
    }
    
    // methods (behaviors)

    // growl
    public String growl() {
        return "grrrrrrr";
    }

    public int humansEaten() {
        return humansEaten;
    }
    
}
