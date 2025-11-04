public class Cat {
    String name;
    String ownerName;
    int moodLevel;
    String catId;
    char catChar;
    boolean isHungry;

    // constructors
    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
        this.name = name;
        this.ownerName = ownerName;
    }

    public Cat() {
        this.name = "Cookie";
        this.ownerName = "Bob";
        this.moodLevel = 5;
        this.catId = "1000";
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    // getters
    // setters
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

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
        setCatChar(PurrfectUtils.generateCatChar(this.catId));
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // methods
    public String generateCatTag() {
        return getCatId() + getCatChar();
    }

    public String toString() {
        String string1 = "== ABOUT " + getName() + " ==\n" + getName() + " is a cat.\n";
        String string2 = "Their tag is " + getCatId() + getCatChar() + ".\n";
        String string3 = PurrfectUtils.determineCatMood(this);
        return string1 + string2 + string3;
    }

    public boolean equals(Cat other) {
        boolean part1 = this.name.equals(other.name) && this.ownerName.equals(other.ownerName);
        boolean part2 = this.moodLevel == other.moodLevel && this.catId.equals(other.catId);
        boolean part3 = this.catChar == other.catChar && this.isHungry == other.isHungry;
        return (part1 && part2 && part3);

    }

}
