public class Unit3ExercisesTester {
    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
        testCalculateSumofSquares();
        testGetNthFibonacci();
        testSortArrayDescending();
        testFindLongestWord();
        testCalculateInterest();
        testParsePositiveInteger();
        testGetArrayElement();
        testCalculateSquareRoot();
        testSumArrayElements();
        testCalculatePower();
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element in array
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
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
        int[] testPositives = { 0, 1, 2, 3 };
        System.out.println("Expected 3: " + Unit3Exercises.findMaxValue(testPositives));
        // Test Edge Case - An array containing both negative integers and zero
        int[] testNegativesand0 = { 0, -1, -2, -3 };
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(testNegativesand0));
        // Test Edge Case - An array containing only negative integers
        int[] testNegatives = { -1, -2, -3 };
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
        String str = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(str));
        str = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(str));
        str = null;
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(str));
        str = "  ";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(str));
    }

    public static void testSumEvenNumbers() {
        int[] num = { 1, 2, 3, 4 };
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(num));
        int[] num2 = { -1, -2, -3, -4 };
        System.out.println("Expected -6: " + Unit3Exercises.sumEvenNumbers(num2));
        int[] num3 = { 1, -2, -3, 4 };
        System.out.println("Expected 2: " + Unit3Exercises.sumEvenNumbers(num3));
        int[] num4 = null;
        try {
            Unit3Exercises.sumEvenNumbers(num4);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testCalculateSumofSquares() {
        int[] num = { 1, 2, 3 };
        System.out.println("Expected 14:" + Unit3Exercises.calculateSumOfSquares(num));
        num = null;
        try {
            Unit3Exercises.calculateSumOfSquares(num);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testGetNthFibonacci() {
        int num = 4;
        System.out.println("Expected 3: " + Unit3Exercises.getNthFibonacci(num));
        num = 5;
        System.out.println("Expected 5: " + Unit3Exercises.getNthFibonacci(num));
        num = -2;
        try {
            System.out.println(Unit3Exercises.getNthFibonacci(num));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testSortArrayDescending() {
        int[] arr = { 2, 4, 3, 5, 1 };
        int[] x = Unit3Exercises.sortArrayDescending(arr);
        System.out.println("Expected: 1, 2, 3, 4, 5: " + Unit3Exercises.printArray(x));
        int[] arr2 = { -2, -4, -3, -5, -1 };
        int[] x2 = Unit3Exercises.sortArrayDescending(arr2);
        System.out.println("Expected: -5, -4, -3, -2, -1: " + Unit3Exercises.printArray(x2));
        int[] arr3 = null;
        
        try {
            int[] x3 = Unit3Exercises.sortArrayDescending(arr3);
            System.out.println("Expected: 1, 2, 3, 4, 5: " + Unit3Exercises.printArray(x3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testFindLongestWord() {
        String s1 = "He ate food";
        System.out.println("Expected food: " + Unit3Exercises.findLongestWord(s1));
        String s2 = "He went in the house";
        System.out.println("Expected house: " + Unit3Exercises.findLongestWord(s2));
        String s3 = "He went for a walk";
        System.out.println("Expected went: " + Unit3Exercises.findLongestWord(s3));
        try {
            System.out.println(Unit3Exercises.findLongestWord(null));
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void testCalculateInterest() {
        double p1 = 100;
        double r1 = 2;
        int y1 = 5;
        System.out.println("Expected 10.41: " + Unit3Exercises.calculateInterest(p1, r1, y1));
        p1 = 1000;
        r1 = 5;
        y1 = 2;
        System.out.println("Expected 1102.5: " + Unit3Exercises.calculateInterest(p1, r1, y1));
        p1 = -1000;
        r1 = -5;
        y1 = 2;
        try {
            System.out.println(Unit3Exercises.calculateInterest(p1, r1, y1));
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void testParsePositiveInteger() {
        String num = "2";
        System.out.println("Expected 2: " + Unit3Exercises.parsePositiveInteger(num));
        num = "-5";
        try {
            System.out.println(Unit3Exercises.parsePositiveInteger(num));
        } catch (Exception e) {
            System.out.println("Expected exception: " + e);
        }
    }

    public static void testGetArrayElement() {
        String arr[] = {"house", "food", "pet"};
        System.out.println("Expected \'House\': " + Unit3Exercises.getArrayElement(arr, 0));
        try {
            System.out.println(Unit3Exercises.getArrayElement(arr, 3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testCalculateSquareRoot() {
        int num = 16;
        System.out.println("Expected 4: " + Unit3Exercises.calculateSquareRoot(num));
        num = -1;
        try {
            System.out.println(Unit3Exercises.calculateSquareRoot(num));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testSumArrayElements() {
        int[] array = {1, 2, 3, 4};
        System.out.println("Expected 10: " + Unit3Exercises.sumArrayElements(array));
        try {
            System.out.println(Unit3Exercises.sumArrayElements(null));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testCalculatePower() {
        double base = 2;
        int exponent = 3;
        System.out.println("Expected 8: " + Unit3Exercises.calculatePower(base, exponent));
        exponent = -1;
        try {
            System.out.println(Unit3Exercises.calculatePower(base, exponent));
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
