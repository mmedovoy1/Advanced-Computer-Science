public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a comma and enclosing the
     * output in square brackets [].
     *
     * @param array The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        String toReturn = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                toReturn += array[0];
            } else {
                toReturn = toReturn + ", " + array[i];
            }
        }
        String toPrint = "[" + toReturn + "]";
        System.out.println(toPrint);
        return toPrint;
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and enclosing the
     * output in square brackets [].
     *
     * @param array The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {
        String toReturn = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                toReturn += array[0];
            } else {
                toReturn = toReturn + ", " + array[i];
            }
        }
        String toPrint = "[" + toReturn + "]";
        System.out.println(toPrint);
        return toPrint;
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            num = Math.max(num, array[i]);
        }
        return num;
    }

    /**
     * The method returns the longest String in the array. If two Strings share the longest length,
     * the method will return the one that appears first in the array.
     *
     * @param array The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        int num = array[0].length();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                num = Math.max(num, array[i].length());
            }
        }
        String longest = "";
        boolean biggest = false;
        while (biggest == false) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && array[i].length() == num) {
                    longest = array[i];
                    if (longest.length() == num) {
                        biggest = true;
                    }
                }
            }
        }
        return longest;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        int total = 0;
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                total += array[i].length();
                length++;
            }
        }
        if (length == 0) {
            return 0;
        } else {
            return total / length;
        }
    }

    /**
     * Counts the number of times each letter appears in the given String. The method creates an
     * array of integers length 26, where each element represents the frequency of a letter in the
     * alphabet. The first element (index 0) represents the frequency of the letter 'a', the second
     * element (index 1) represents the frequency of the letter 'b', and so on.
     *
     * @param input The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input string.
     */
    public static int[] countLetterFrequencies(String input) {
        if (input != null) {
            input = input.toLowerCase();
            int[] array = new int[26];
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
                    array[(int) (input.charAt(i)) - 97]++;
                }
            }
            return array;
        } else {
            return new int[0];
        }

    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by one, and assigns
     * a value of zero to the last element in the array.
     *
     * @param array The array of int values
     * @param index The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {
        for (int i = index; i < array.length; i++) {
            if (i < array.length - 1) {
                array[i] = array[i + 1];
            } else if (i == array.length - 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        } else {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < newArray.length; i++) {
                if (i < array.length) {
                    newArray[i] = array[i];
                } else {
                    newArray[i] = 0;
                }
            }
            return newArray;
        }
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of each String in
     * the array. For example, if the array contained: {"Hello", "my", "name", "is", "Larry"}, then
     * this method would return an array with the contents: {"#0 Hello", "#1 my", "#2 name", "#3
     * is", "#4 Larry"}.
     *
     * @param array The array of Strings to modify
     * @return The modified array with the number symbol and element number added to each String
     */
    public static String[] addNumToStringArray(String[] array) {
        if (array == null) {
            return new String[0];
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = "null";
                } else {
                    array[i] = "#" + i + " " + array[i];
                }
            }
            return array;
        }
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        } else {
            int[] newArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[array.length - 1 - i];
            }
            return array;
        }

    }

}
