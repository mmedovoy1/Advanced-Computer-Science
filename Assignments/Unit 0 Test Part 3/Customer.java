public class Customer {
    // instance variables
    private String name;
    private String address;
    private int rewardPoints;

    // constructors
    public Customer (String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;
    }

    // getters
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getRewardPoints(){
        return rewardPoints;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setRewardPoints(int rewardPoints){
        this.rewardPoints = rewardPoints;
    }

    // Methods
    public String toString(){
        return("")
    }
    
}