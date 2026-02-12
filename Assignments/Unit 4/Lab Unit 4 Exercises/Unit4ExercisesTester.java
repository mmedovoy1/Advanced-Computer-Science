import java.util.ArrayList;

public class Unit4ExercisesTester {
    public static void main(String[] args) {
        testMatchingEndSequences();
        testHasThreeConsecutive();
        testGenerateNumberSequence();
        testFizzBuzz();
        testMoveEvenBeforeOdd();
        testNoNegatives();
        testExcludeTeenNumbers();
        testAppendY();
        testSquarePlus10();
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
        int[] nums = {2, 1, 3, 5};
        System.out.println("Expected true: " + Unit4Exercises.hasThreeConsecutive(nums));
        int[] nums1 = {2, 1, 2, 5};
        System.out.println("Expected false: " + Unit4Exercises.hasThreeConsecutive(nums1));
        int[] nums2 = {2, 4, 2, 5};
        System.out.println("Expected true: " + Unit4Exercises.hasThreeConsecutive(nums2));
    }

    public static void testGenerateNumberSequence() {
        System.out.println(Utils.printIntArray(Unit4Exercises.generateNumberSequence(5, 10)));
    }

    public static void testFizzBuzz() {
        System.out.println(Utils.printStringArray(Unit4Exercises.fizzBuzz(1, 6)));
    }

    public static void testMoveEvenBeforeOdd() {
        int[] nums = {1, 0, 1, 0, 0, 3, 1};
        System.out.println(Utils.printIntArray(Unit4Exercises.moveEvenBeforeOdd(nums)));
    }

    public static void testNoNegatives() {
        ArrayList<Integer> testing = new ArrayList<Integer>();
        testing.add(-3);
        testing.add(-1);
        testing.add(4);
        testing.add(0);
        System.out.println(Unit4Exercises.noNegatives(testing));
    }

    public static void testExcludeTeenNumbers() {
        ArrayList<Integer> testing = new ArrayList<Integer>();
        testing.add(1);
        testing.add(14);
        testing.add(20);
        testing.add(19);
        System.out.println(Unit4Exercises.excludeTeenNumbers(testing));
    }

    public static void testAppendY() {
        ArrayList<String> testing = new ArrayList<String>();
        testing.add("a");
        testing.add("b");
        testing.add("cy");
        System.out.println(Unit4Exercises.appendY(testing));
    }

    public static void testSquarePlus10() {
        ArrayList<Integer> testing = new ArrayList<Integer>();
        testing.add(1);
        testing.add(6);
        testing.add(5);
        testing.add(10);
        System.out.println(Unit4Exercises.squarePlus10(testing));
    }



}
