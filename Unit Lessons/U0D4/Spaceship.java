// camelCase -> a way to write bariablel names, and its a standard
// TheFoxJumpeOverTheLazyDog
// keep the first letter lowercase if it's a variable name
// otherwise keep it capital for class names





// a c;ass is just a blueprint for a new data type
// -> it's not the object itself, but rather a plan
public class Spaceship {

    // instance variables
    private String description;
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldsActive;

    // constructors
    public Spaceship(String inputDescription, int inputPassengerCount, double inputFuelLevel, boolean inputShieldsActive){
       description = inputDescription;
       passengerCount = inputPassengerCount;
       fuelLevel = inputFuelLevel;
       shieldsActive = inputShieldsActive;

    }


    // methods
    // getters
  
    public String getDescription(){
        return description;
    }

    public int getPassengerCount(){
        return passengerCount;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public boolean getShieldsActive(){
        return shieldsActive;
    }

    // setters (these are void)
    public void setDescription(String input) {
        description = input;
    }

    public void setPassengerCount(int input) {
        passengerCount = input;
    }

    public void setFuelLevel(double input) {
        fuelLevel = input;
    }

    public void setShieldsActive(boolean input) {
        shieldsActive = input;
    }

    // challenge use 3 setter to update the values of 3 different instance variables, make sure to print before and after the update.

}