public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;


    // Constructors
    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Ryan";
        this.ownerName = "Daniel";
        this.age = 9;
        this.dogId = 345;
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);
        setDogChar(PawesomeUtils.generateDogChar(this.dogId));
        setDogTag(PawesomeUtils.generateDogTag(this.dogId, getDogChar()));
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    // Methods
    public String toString() {
        String firstPart = (name + " is a good dog. They are " + age + " years old and belong to "
                + ownerName + ".");
        String secondPart = "";
        if (stillInFacility) {
            secondPart = (" They are currently in our facility. For employee use only: DogTag is "
                    + dogTag + dogChar + ". ");
        } else {
            secondPart =
                    (" They are currently not in our facility. For employee use only: DogTag is "
                            + dogTag + dogChar + ".");
        }
        return (firstPart + secondPart);
    }

    public boolean equals(Dog other) {
        boolean partOne = this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
                && this.age == other.age && this.dogId == other.dogId;
        boolean partTwo = (this.dogChar == other.dogChar && this.dogTag.equals(other.dogTag)
                && this.stillInFacility == other.stillInFacility);
        return (partOne && partTwo);
    }
}
