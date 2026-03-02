public class Lion extends Animal implements Predator, Pettable{
    // constructors
    public Lion() {
        super("Lion", "Carnivora", "Felidae", "Panthera", "P. leo", "Grasslands, Savannahs, Shrublands");

    }

    // methods
    @Override
    public String getFact(int index) {
        String fact1 = "Lions are very social";
        String fact2 = "Lions sleep or rest up to 21 hours a day";
        String fact3 = "Lions live in prides";
        String fact4 = "Lions are the second largest cat in the world, behind tigers";
        String fact5 = "Lions can run up to 50mph";
        String[] facts = {fact1, fact2, fact3, fact4, fact5};
        return facts[index];
    }

    @Override
    public String getFact() {
        String fact1 = "Lions are very social";
        String fact2 = "Lions sleep or rest up to 21 hours a day";
        String fact3 = "Lions live in prides";
        String fact4 = "Lions are the second largest cat in the world, behind tigers";
        String fact5 = "Lions can run up to 50mph";
        String[] facts = {fact1, fact2, fact3, fact4, fact5};
        return facts[(int) Math.random() * 4];
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void eat() {
        System.out.println("Grrrr");
    }

    @Override
    public void move() {
        System.out.println("huff, huff");
    }

    @Override
    public String getSoundDescription() {
        return "Loud roar";
    }

    @Override
    public String getEatDescription() {
        return "They growl, grunt, and rumble";
    }

    @Override
    public String getMoveDescription() {
    return "Chuffing, Grunting, Huffs";
    }

    @Override
    public int getFriendlinessLevel() {
        return 2;
    }

    @Override
    public int getEnergyLevel() {
        return 3;
    }

    @Override
    public void greetHuman() {
        System.out.println("Rrrr");;
    }

    @Override
    public void bePetted() {
        System.out.println("Purr");
    }

    @Override
    public void playWithHuman() {
        System.out.println("Rrrr");;
    }

    @Override
    public String getPrimaryPrey() {
        return "Wildebeest";
    }

    @Override
    public double getAveragePreyMass() {
        return 640;
    }

    @Override
    public void stalkPrey() {
        System.out.println("They hide and use stealth and teamwork");
    }

    @Override
    public void attackPrey() {
        System.out.println("They suffocate their prey by biting them on the neck or they strangle their prey");
    }

    @Override
    public void eatPrey() {
        System.out.println("They use their sharp claws and teeth to cut up their prey");
    }
    
    
}
