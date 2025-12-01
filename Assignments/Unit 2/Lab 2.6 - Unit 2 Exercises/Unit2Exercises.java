public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            if (day != 0 && day != 6) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (day != 0 && day != 6) {
                return "10:00";
            } else {
                return "off";
            }
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6 || (a + b) == 6 || (a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        if (str.equals("")) {
            return str;
        } else if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (str.substring(str.length() - 1).equals("b")) {
            return "Buzz";
        } else {
            return str;
        }

    }

    public static String doubleChar(String str) {
        String toPrint = "";
        for (int i = 0; i < str.length(); i++) {
            toPrint = toPrint + str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return toPrint;

    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < (str.length() - 1); i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count += 1;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < (str.length() - 2); i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat += 1;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dog += 1;
            }
        }
        return cat == dog;
    }

    public static String mixString(String a, String b) {
        String shortest = "";
        String longest = "";
        if (a.length() <= b.length()) {
            shortest = a;
            longest = b;
        } else {
            shortest = b;
            longest = a;
        }
        String mixed = "";
        for (int i = 0; i < b.length(); i++) {
            if (i < a.length()) {
                mixed = mixed + a.substring(i, i + 1) + b.substring(i, i + 1);
            }
        }
        mixed = mixed + longest.substring(shortest.length());
        return mixed;
    }

    public static String repeatEnd(String str, int n) {
        String cut = "";
        for (int i = 0; i < n; i++) {
            cut += str.substring(str.length() - n);
        }
        return cut;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        String shortest = "";
        String longest = "";
        if (a.length() <= b.length()) {
            shortest = a;
            longest = b;
        } else {
            shortest = b;
            longest = a;
        }
        if ((longest.substring((longest.length() - shortest.length())).equals(shortest))) {
            return true;
        } else {
            return false;
        }
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                count += 1;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int smallest = nums[0];
        int biggest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            smallest = Math.min(smallest, nums[i]);
            biggest = Math.max(biggest, nums[i]);
        }
        return biggest - smallest;
    }

    public static int sum13(int[] nums) {
        if (nums.length != 0) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 13) {
                    sum += nums[i];
                } else {
                    i += 2;
                }
            }
            return sum;
        } else {
            return 0;
        }
    }

    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        boolean three = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count += 1;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                three = true;
            }
        }
        if (count == 3 && !three) {
            return true;
        } else {
            return false;
        }
    }

    public static String[] fizzArray2(int n) {
        if (n != 0) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++) {
                array[i] = String.valueOf(i);
            }
            return array;
        } else {
            return new String[0];
        }
    }

    public static int[] zeroFront(int[] nums) {
        int zerocount = 0;
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zerocount += 1;
            }
        }
        for (int i = 0; i < zerocount; i++) {
            array[i] = 0;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (nums[i] != 0) {
                count += 1;
                array[count + zerocount - 1] = nums[i];
            }
        }
        return array;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int tarcount = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                tarcount += 1;
            }
        }
        String[] array = new String[words.length - tarcount];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count += 1;
                array[count - 1] = words[i];
            }
        }
        return array;
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        int denom = 0;
        for (int i = 0; i < end - start; i++) {
            sum += scores[i + start];
            denom += 1;
        }
        return sum / denom;
    }

    public static int scoresAverage(int[] scores) {
        int firstAverage = average(scores, 0, scores.length / 2);
        int lastAverage = average(scores, scores.length / 2, scores.length);
        if (firstAverage >= lastAverage) {
            return firstAverage;
        } else {
            return lastAverage;
        }
    }


    public static boolean scoresIncreasing(int[] scores) {
        boolean increasing = true;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                increasing = false;
            }
        }
        return increasing;
    }

    public static int largestSpecial(int[] scores) {
        int largest = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 10 == 0) {
                largest = Math.max(largest, scores[i]);
            }
        }
        return largest;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int largestA = largestSpecial(a);
        int largestB = largestSpecial(b);
        return largestA + largestB;
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "*";
        } else {
            return "**";
        }
    }

    public static double divide(int a, int b) {
        double c = (double) (a);
        double d = (double) (b);
        if (b == 0 || a == 0) {
            return 0;
        } else if (a > b) {
            return c / d;
        } else {
            return d / c;
        }
    }
}
