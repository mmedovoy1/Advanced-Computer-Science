public class TriangleLoops {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        System.out.println(createLetterTriangleUp(3, 'A'));
        System.out.println(createLetterTriangleUp(15, 'B'));

    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a number of letters
     * equal to the row number. The total number of rows printed is determined by numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @param letter the letter to be printed
     * 
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        int row = 0;
        String triangle = "";
        while (row != numberOfRows) {
            for (int col = -1; col < row; col++) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
            row += 1;
        }
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a number of letters
     * equal to the total number of rows, descending downward. The total number of rows printed is
     * determined by numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @param letter the letter to be printed
     * 
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        int row = numberOfRows;
        String triangle = "";
        while (row != 0) {
            for (int col = row; col > 0; col--) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
            row -= 1;
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the triangle is
     * determined by the numberOfRows, and the number used in each row is determined by the row
     * number.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        int row = 0;
        String triangle = "";
        while (row != numberOfRows) {
            for (int col = 0; col <= row; col++) {
                triangle = triangle + (row + 1) + " ";
            }
            row += 1;
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet. The method
     * determines the height of the pyramid by using the int numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        for (int row = 0; row < numberOfRows; row++) {
            for (int space = (numberOfRows - row); space > 1; space--) {
                triangle = triangle + "*";
            }
            for (int col = 0; col <= row; col++) {
                triangle = triangle + (char) ('A' + col);
            }
            for (int col = row; col > 0; col--) {
                triangle = triangle + (char) ('A' + col - 1);
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

}
