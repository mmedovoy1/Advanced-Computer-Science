public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        if (strs == null) {
            throw new NullPointerException("This string array doesn't exist");
        } // array was null
        while (i < strs.length) {
            if (strs[i] != null){ // make sure that string in array that is counted isn't null
                sum += strs[i].length();
                counted++;
            }
            i++;
        }
        return sum / counted;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        if (str == null) { // makes sure that string is not null
            throw new NullPointerException("This string doesn't exist");
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right - 1] = temp;
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]); 
        }
        return new String(chars);
    }
}
