public class Tester {
    public static void main(String[] args) {
        testMatchingEndSequences();
        testHasThreeConsecutive();
        testGenerateNumberSequence();
        testFizzBuzz();
        testMoveEvenBeforeOdd();
    } 

    public static void testMatchingEndSequences() {
        int[] nums = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(Unit4Exercises.matchingEndSequences(nums, 1));
        System.out.println(Unit4Exercises.matchingEndSequences(nums, 2));
        System.out.println(Unit4Exercises.matchingEndSequences(nums, 3));
        try {
            Unit4Exercises.matchingEndSequences(null, 1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Unit4Exercises.matchingEndSequences(nums, -1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testHasThreeConsecutive() {
        int nums[] = {2, 1, 3, 5};
        System.out.println("Expected true: " + Unit4Exercises.hasThreeConsecutive(nums));
        int nums1[] = {2, 1, 2, 5};
        System.out.println("Expected false: " + Unit4Exercises.hasThreeConsecutive(nums1));
        int nums2[] = {2, 4, 2, 5};
        System.out.println("Expected true: " + Unit4Exercises.hasThreeConsecutive(nums2));
    }

    public static void testGenerateNumberSequence() {
        System.out.println(Utils.printIntArray(Unit4Exercises.generateNumberSequence(5, 10)));
    }

    public static void testFizzBuzz() {
        System.out.println(Utils.printStringArray(Unit4Exercises.fizzBuzz(1, 6)));
    }

    public static void testMoveEvenBeforeOdd() {
        int[] nums = { 1, 0, 1, 0, 0, 3, 1};
        System.out.println(Utils.printIntArray(Unit4Exercises.moveEvenBeforeOdd(nums)));
    }




}
