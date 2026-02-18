import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("invalid rows or cols");
        }
        this.kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("animal is null");
        }
        boolean filled = false;
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] == null && filled == false) {
                    kennels[i][j] = animal;
                    filled = true;
                }
            }
        }
        if (filled == false) {
            System.out.println("No empty kennels.");
        }
    }


    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("animal is null");
        }
        if (row > kennels.length - 1 || row < 0) {
            throw new IllegalArgumentException("not valid row");
        }
        if (col > kennels[row].length - 1 || col < 0) {
            throw new IllegalArgumentException("not valid col");
        }
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }

    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("animals is null");
        }
        for (int i = 0; i < animals.size(); i++) {
            add(animals.get(i));
        }
    }

    public Dog adopt(int row, int col) {
        if (row > kennels.length - 1 || row < 0) {
            throw new IllegalArgumentException("not valid row");
        }
        if (col > kennels[row].length - 1 || col < 0) {
            throw new IllegalArgumentException("not valid col");
        }
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("no dog in this spot");
        }
        kennels[row][col] = null;

        return kennels[row][col];

    }

    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }
        ArrayList<Dog> found = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j].getName().equals(name)) {
                    found.add(kennels[i][j]);
                }
            }
        }
        return found;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age can't be negative");
        }
        ArrayList<Dog> found = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j].getAge() == age) {
                    found.add(kennels[i][j]);
                }
            }
        }
        return found;
    }
}
