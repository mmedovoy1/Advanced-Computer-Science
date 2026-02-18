public abstract class Animal {
    // common instance variables
    private double age;

    // common abstract methods
    public abstract void eat();

    public abstract void funFact();

    public abstract String getScientificName();

    public abstract void makeNoise();

    public abstract String getSpecies();



    // getters (not abstract)
    protected double getAge() {
        return age;
    }

    protected void setAge(double age) {
        this.age = age;
    }
    
}
