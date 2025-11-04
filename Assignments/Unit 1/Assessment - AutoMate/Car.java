public class Car {
    String model;
    String ownerName;
    String userName;
    int cleanlinessLevel;
    boolean needsOilChange;


    public Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        this.userName = AutoUtils.generateUsername(ownerName);
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsOilChange = false;
    }

    public Car() {
        this.model = "car";
        this.ownerName = AutoUtils.fixName("Matthew Medovoy");
        this.userName = AutoUtils.generateUsername(ownerName);
        this.cleanlinessLevel = 5;
        this.needsOilChange = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    


    public String toString() {
        String string1 = "== About Car ==\nModel: " + getModel() + "\nOwner: " + getOwnerName();
        String string2 = "\nUsername: " + getUserName() + "Cleanliness Level: " + getCleanlinessLevel();
        String string3 = "";
        if (isNeedsOilChange() == false) {
            string3 += "\nDoes car need oil change? No";
        } else {
            string3 += "\nDoes car need oil change? Yes";
        }
        return string1 + string2 + string3;
    }

    public boolean equals(Car other) {
        boolean part1 =  this.model.equals(other.model) && this.ownerName.equals(other.ownerName);
        boolean part2 = this.cleanlinessLevel == other.cleanlinessLevel;
        boolean part3 = this.needsOilChange == other.needsOilChange;
        return part1 && part2 && part3;
    }
}