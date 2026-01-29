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
            if (strs[i] != null) { // make sure that string in array that is counted isn't null
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
            chars[right] = temp;
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]);
        }
        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("The int array is null");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i - 1];
            } else if (numbers[i] == max && i % 2 == 0) {
                max = max + 1;
            }
        }
        return max; // took away negative
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            System.out.println("This isnt a palindorme, is null");
            return false;
        }
        if (str.equalsIgnoreCase(reverseString(str))) {
            System.out.println("This is a palindrome");
            return true;
        } else {
            System.out.println("Not a palindrome");
            return false;
        }
    }

    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Numbers is null");
        } // checked if numbers[] is null
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i + 1];
            } else {
                sum = sum - i;
            }
        }
        if (sum == 0) {
            sum = numbers.length;
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("numbers is null");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("int can't be negative");
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int[] sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("arr can't be null");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static String printArray(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("arr can't be null");
        }
        String x = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                x += " " + arr[i];
            } else if (i == 0) {
                x += arr[i] + ",";
            } else {
                x += " " + arr[i] + ",";
            }
        }
        return x + "}";
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("sentence can't be null");
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException("can't be negative");
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        int number = Integer.parseInt(str);
        if (number <= 0) {
            throw new NumberFormatException("number is <= 0"); // added an exception
        }
        return number;
    }

    public static String getArrayElement(String[] arr, int index) {
        if (index > arr.length) {
            return null;
        } else {
            return arr[index];
        }
    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative num");
        }
        return Math.sqrt(number);

    }

    public static int sumArrayElements(int[] array) {
        if (array == null) {
            throw new NullPointerException("array is null");
        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
    }

    public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Can't have negative exponent");
        } else {
            return Math.pow(base, exponent);
        }

    }

}
