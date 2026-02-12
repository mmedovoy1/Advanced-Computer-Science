import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        if (nums == null) {
            throw new NullPointerException("nums can't be null");
        }
        if (n > nums.length || n < 0) {
            throw new IllegalArgumentException("n can't be > nums.length or < 0");
        }
        for (int i = 0; i < n; i++) {
            if (nums[0 + i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int x) {
        if (x < 0) {
            return false;
        }
        if (x % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int x) {
        if (x < 0) {
            return false;
        }
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        if (nums == null) {
            return false;
        }
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (isOdd(nums[i]) && isOdd(nums[i + 1]) && isOdd(nums[i + 2])) {
                return true;
            }
            if (isEven(nums[i]) && isEven(nums[i + 1]) && isEven(nums[i + 2])) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        if (end <= start) {
            throw new IllegalArgumentException("end value can't be less than start value");
        }
        int[] sequence = new int[end - start];
        int count = start;
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = count;
            count++;
        }
        return sequence;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        if (end <= start) {
            throw new IllegalArgumentException("end value can't be less than start value");
        }
        if (start < 0 || end < 0) {
            throw new IllegalArgumentException("start or end has to be less than 0");
        }
        String[] sequence = new String[end - start];
        int count = start;
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = String.valueOf(count);
            count++;
        }
        for (int i = 0; i < sequence.length; i++) {
            if (Integer.parseInt(sequence[i]) % 15 == 0) {
                sequence[i] = "FizzBuzz";
            } else if (Integer.parseInt(sequence[i]) % 3 == 0) {
                sequence[i] = "Fizz";
            } else if (Integer.parseInt(sequence[i]) % 5 == 0) {
                sequence[i] = "Buzz";
            }
        }
        return sequence;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int counte = 0;
        int counto = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                counte++;
            } else {
                counto++;
            }
        }
        int[] evens = new int[counte];
        int[] odds = new int[counto];
        int countevens = 0;
        int countodds = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evens[countevens] = nums[i];
                countevens++;
            } else {
                odds[countodds] = nums[i];
                countodds++;
            }
        }
        for (int i = 0; i < evens.length; i++) {
            nums[i] = evens[i];
        }
        for (int i = 0; i < odds.length; i++) {
            nums[i + evens.length] = odds[i];
        }
        return nums;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        if (nums == null) {
            throw new NullPointerException("nums is null");
        }
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= 0) {
                toReturn.add(nums.get(i));
            }
        }
        return toReturn;
    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        if (nums == null) {
            throw new NullPointerException("nums is null");
        }
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 13 || nums.get(i) > 19) {
                toReturn.add(nums.get(i));
            }
        }
        return toReturn;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        if (strs == null) {
            throw new NullPointerException("strs is null");
        }
        ArrayList<String> toReturn = new ArrayList<String>();
        for (int i = 0; i < strs.size(); i++) {
            String x = strs.get(i);
            if (x.length() == 0 || !x.substring(x.length() - 1).equals("y")) {
                toReturn.add(strs.get(i) + "y");
            }
        }
        return toReturn;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        if (nums == null) {
            throw new NullPointerException("nums is null");
        }
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int x = (int) (Math.pow(nums.get(i), 2) + 10);
            if (x % 10 != 6 && x % 10 != 5) {
                toReturn.add(x);
            }
        }
        return toReturn;
    }

}
