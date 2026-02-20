public abstract class Animal {
    // common instance variables
    private double age;
    private String name;
    private boolean isAlive;
    protected double hunger;
    private double weight;
    private int speed;



    // getters (not abstract)
    protected double getAge() {
        return age;
    }

    protected void setAge(double age) {
        this.age = age;
    }
    
    // common abstract methods
    public abstract void eat();

    public abstract void funFact();

    public abstract String getScientificName();

    public abstract void makeNoise();

    public abstract String getSpecies();

    public abstract boolean isAlive();


}
