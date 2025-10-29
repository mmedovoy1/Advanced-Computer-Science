public class Unit1Exercises {

    // method: helloName
    /*
     * Given a string name, such as "Bob", this method will return a greeting in the form of
     * "Hello Bob!".
     */
    /*
     * Tester examples: helloName("Bob") -> "Hello Bob!" helloName("Alice") -> "Hello Alice!"
     * helloName("X") -> "Hello X!"
     */

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    // method: makeOutWord
    /*
     * Given an "out" string of length 4, such as "<<>>", and a word, return a new string where the
     * word is in the middle of the "out" string, e.g. "<<word>>".
     * 
     * Note: To extract the string starting at index i and going up to but not including index j,
     * use "str.substring(i, j)".
     */
    /*
     * Tester examples: makeOutWord("<<>>", "Yay") -> "<<Yay>>" makeOutWord("<<>>", "WooHoo") ->
     * "<<WooHoo>>" makeOutWord("[[]]", "word") -> "[[word]]"
     */
    public static String makeOutWord(String out, String word) {
        String first = out.substring(0, 2);
        String last = out.substring(2, 4);
        return first + word + last;
    }

    // method: withoutEnd
    /*
     * Given a string,return a version without the first and last char, so "Hello" yields "ell". The
     * string length will be at least 2.
     */
    /*
     * Tester examples: withoutEnd("Hello") -> "ell" withoutEnd("java") -> "av" withoutEnd("coding")
     * -> "odin"
     */
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    // method: comboString
    /*
     * Given two strings, a and b, return a string of the form short+long+short. The shorter string
     * should be on the outside and the longer string on the inside. Note that the strings will not
     * be the same length, but they may be empty (length 0).
     */
    // Tester examples:
    /*
     * comboString("Hello", "hi") -> "hiHellohi" comboString("hi", "Hello") -> "hiHellohi"
     * comboString("aaa", "b") -> "baaab"
     */
    public static String comboString(String a, String b) {
        if (a.length() >= b.length()) {
            return b + a + b;
        } else if (b.length() > a.length()) {
            return a + b + a;
        }
        return "";
    }

    // method: left2
    /*
     * Given a string, return a modified string where the first 2 chars are moved to the end. The
     * string length will be at least 2.
     */
    /*
     * Tester examples: left2("Hello") -> "lloHe" left2("java") -> "vaja" left2("Hi") -> "Hi"
     */
    public static String left2(String str) {
        String cut1 = str.substring(2, str.length());
        String cut2 = str.substring(0, 2);
        return cut1 + cut2;
    }

    // method: middleThree
    /*
     * Given a string of odd length, return the middlemost string of length 3. For example, "Candy"
     * yields "and". The string length will be at least 3.
     */
    /*
     * Tester examples: middleThree("Candy") -> "and" middleThree("and") -> "and"
     * middleThree("solving") -> "lvi"
     */
    public static String middleThree(String str) {
        if (str.length() == 3) {
            return str;
        } else if (str.length() > 3) {
            int half = str.length() / 2;
            if (str.length() % 2 == 1) {
                return str.substring(half - 1, half + 2);
            } else if (str.length() % 2 == 0) {
                return str.substring(half - 1, half + 1);
            }
        }
        return "";
    }

    // method: withoutEnd2
    /*
     * Given a string, return a version without both the first and last characters. The string may
     * have any length, including 0.
     */
    /*
     * Tester examples: withoutEnd2("Hello") -> "ell" withoutEnd2("abc") -> "b" withoutEnd2("ab") ->
     * ""
     */
    public static String withoutEnd2(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        }
        return "";
    }

    // method: stringEnds
    /*
     * Given a string and an int n, return a string made of the first and last n chars from the
     * string. The string length will be at least n.
     */
    /*
     * Tester examples: stringEnds("Hello", 2) -> "Helo" stringEnds("Chocolate", 3) -> "Choate"
     * stringEnds("Chocolate", 1) -> "Ce"
     */
    public static String stringEnds(String str, int n) {
        if (str.length() >= n) {
            return str.substring(0, n) + str.substring(str.length() - n, str.length());
        }
        return "";
    }

    // method: hasBad
    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
     * with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
     */
    /*
     * Tester examples: hasBad("badxx") -> true hasBad("xbadxx") -> true hasBad("xxbadxx") -> false
     */
    public static boolean hasBad(String str) {
        String bad = "bad";
        if (str.indexOf(bad) == 0 || str.indexOf(bad) == 1) {
            return true;
        } else {
            return false;
        }
    }

    // method: countVowels
    /*
     * Given a string, return the number of vowels in the string. Vowels are the letters a, e, i, o,
     * and u. The string may be any length, including 0.
     */
    /*
     * Tester examples: countVowels("Hello") -> 2 countVowels("abc") -> 1 countVowels("") -> 0
     */
    public static int countVowels(String input) {
        int numvowels = 0;
        for (int count = 0; count < input.length(); count++) {
            if (input.charAt(count) == (char) ('a') || input.charAt(count) == (char) ('e')
                    || input.charAt(count) == (char) ('i') || input.charAt(count) == (char) ('o')
                    || input.charAt(count) == (char) ('u') || input.charAt(count) == (char) ('A')
                    || input.charAt(count) == (char) ('E') || input.charAt(count) == (char) ('I')
                    || input.charAt(count) == (char) ('O') || input.charAt(count) == (char) ('U')) {
                numvowels += 1;
            }
        }
        return numvowels;
    }

    // method: countCode
    /*
     * Return the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     */
    /*
     * Tester examples: countCode("aaacodebbb") -> 1 countCode("codexxcode") -> 2
     * countCode("cozexxcope") -> 2
     */
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i).indexOf("co") == 0 && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

}
