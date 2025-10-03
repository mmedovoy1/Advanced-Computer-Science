public class Cat {
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat (String name, String breed) {
		this.name = name;
		this.breed = breed;
		this.isHungry = true;
		this.livesRemaining = 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry(){
		return isHungry;
	}

	public void feed() {
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return this.name == other.name && this.breed == other.breed
			&& this.livesRemaining == other.livesRemaining;
	}

	public String toString() {
		return(name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
	}
}