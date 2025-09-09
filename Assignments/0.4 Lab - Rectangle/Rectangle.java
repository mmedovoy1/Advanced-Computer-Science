public class Rectangle {
    private int length;
    private int width;

    // constructors
    public Rectangle(int newLength, int newWidth){
        length = newLength;
        width= newWidth;
    }
    public Rectangle() {
        length = 5;
        width = 2;
    }

    // getters
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    // setters
    public void setLength(int input) {
        length = input;
    }
    public void setWidth(int input) {
        width = input;
    }

    // methods
    public String toString(){
        return("This rectangle has a length of " + length + " and a width of " + width + ".");
    }

    public boolean equals(Rectangle other){
        return length == other.length && width == other.width;
    }

    public int calculateArea(){
        return  length * width;
    }

    public int calculatePerimeter(){
        return 2 * (length + width)
    }

    public double calculateDiagonal(){
        return Math.sqrt(length * length + width * width);
    }
}
