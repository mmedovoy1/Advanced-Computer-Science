public class Unit3ExercisesTester {
    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
        testCalculateSumofSquares();
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = {"abc", "cde", "efg", "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element in array
        letters = new String[] {"abc", "cde", "efg", null, "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }

        System.out.println("Completed average string test");
    }

    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
        System.out.println("Completed reverseString test");
    }

    public static void testFindMaxValue() {
        // Test Main Case - An array containing only positive integers
        int[] testPositives = {0, 1, 2, 3};
        System.out.println("Expected 3: " + Unit3Exercises.findMaxValue(testPositives));
        // Test Edge Case - An array containing both negative integers and zero
        int[] testNegativesand0 = {0, -1, -2, -3};
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(testNegativesand0));
        // Test Edge Case - An array containing only negative integers
        int[] testNegatives = {-1, -2, -3};
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(testNegatives));
        // Test Edge Case - A null array
        int[] testNull = null;
        try {
            Unit3Exercises.findMaxValue(testNull);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw as expected");

        }

        System.out.println("finished task 4");


    }

    public static void testIsPalindrome() {
        String  str = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(str));
        str = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(str));
        str = null;
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(str));
        str = "  ";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(str));
    }

    public static void testSumEvenNumbers() {
        int[] num = {1, 2, 3, 4};
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(num));
        int[] num2 = {-1, -2, -3, -4};
        System.out.println("Expected -6: " + Unit3Exercises.sumEvenNumbers(num2));
        int[] num3 = {1, -2, -3, 4};
        System.out.println("Expected 2: " + Unit3Exercises.sumEvenNumbers(num3));
        int[] num4 = null;
        try {
            Unit3Exercises.sumEvenNumbers(num4);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testCalculateSumofSquares() {
        int[] num = {1, 2, 3};
        System.out.println("Expected 14:" + Unit3Exercises.calculateSumOfSquares(num));
        num = null;
        try{
            Unit3Exercises.calculateSumOfSquares(num);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testGetNthFibonacci() {
        int num = 4;
        System.out.println("Expected 10: " + Unit3Exercises.getNthFibonacci(num));
        int num1 = null;
        try {
            Unit3Exercises.getNthFibonacci(num1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
