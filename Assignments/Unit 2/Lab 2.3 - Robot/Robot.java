public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        setHallway(hallwayToClean);
        setPosition(startingPosition);
        isFacingRight = true;
        // to-do: implement constructor
    }


    public int[] getHallway() {
        return hallway;
    }


    public void setHallway(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        this.hallway = hallway;
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        if (position < 0) {
            position = 0;
        } else if (position > hallway.length) {
            position = hallway.length - 1;
        }
        this.position = position;
    }


    public boolean isFacingRight() {
        return isFacingRight;
    }


    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }


    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (isFacingRight() && getPosition() == (getHallway().length - 1)) {
            return true;
        } else if (!isFacingRight() && getPosition() == 0) {
            return true;
        } else {
            return false;
        }
        // to-do: implement this method
    }

    public void pickup() {
        hallway[getPosition()] = hallway[getPosition()] - 1;
    }

    public void turnAround() {
        if (isFacingRight()) {
            setFacingRight(false);
        } else {
            setFacingRight(true);
        }
    }

    public void moveForward() {
        if (!isRobotBlockedByWall()) {
            if (isFacingRight) {
                setPosition(getPosition() + 1);
            } else {
                setPosition(getPosition() - 1);
            }
        }
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        if (hallway[getPosition()] > 0) {
            pickup();
            if (hallway[getPosition()] == 0) {
                if (isRobotBlockedByWall()) {
                    turnAround();
                } else {
                    moveForward();
                }
            }
        } else {
            if (hallway[getPosition()] == 0) {
                if (isRobotBlockedByWall()) {
                    turnAround();
                } else {
                    moveForward();
                }
            }
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // to-do: implement this method
        while (!hallIsClear()) {
            move();
            count++;
            displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        int total = 0;
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] > 0) {
                total++;
            }
        }
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        String printing = "";
        for (int i = 0; i < hallway.length; i++) {
            printing = printing + hallway[i] + " ";
        }
        System.out.println(printing);
        int spaces = 0;
        String before = "";
        if (position == 1) {
            spaces = position;
        } else if (position > 1) {
            spaces = position + 2;
        }

        for (int i = 0; i < spaces; i++) {
            before += " ";
        }

        if (isFacingRight()) {
            System.out.println(before + ">");
        } else {
            System.out.println(before + "<");
        }


    }
}
