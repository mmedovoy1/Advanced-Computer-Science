public class Unit1ExercisesTester {
    public static void main(String[] args) {
        System.out.println("Testing helloname:");
        System.out.println("Testing \"Bob\": " + Unit1Exercises.helloName("Bob"));
        System.out.println("Testing \"Alice\": " + Unit1Exercises.helloName("Alice"));
        System.out.println("Testing \"X\": " + Unit1Exercises.helloName("X"));

        System.out.println("\nTesting makeOutWord:");
        System.out
                .println("Testing \"<<>>\", \"Yay\": " + Unit1Exercises.makeOutWord("<<>>", "Yay"));
        System.out.println(
                "Testing \"<<>>\", \"WooHoo\": " + Unit1Exercises.makeOutWord("<<>>", "WooHoo"));
        System.out.println(
                "Testing \"[[]]\", \"word\": " + Unit1Exercises.makeOutWord("[[]]", "word"));
                
        System.out.println("\nTesting withoutEnd:");
        System.out.println("Testing \"Hello\": " + Unit1Exercises.withoutEnd("Hello"));

        System.out.println("\nTesting comboString:");
        System.out
                .println("Testing \"Hello\", \"hi\": " + Unit1Exercises.comboString("Hello", "hi"));

        System.out.println("\nTesting left2");
        System.out.println("Testing \"Hello\": " + Unit1Exercises.left2("Hello"));

        System.out.println("\nTesting middleThree");
        System.out.println("Testing \"Candy\": " + Unit1Exercises.middleThree("Candy"));
        System.out.println("Testing \"and\": " + Unit1Exercises.middleThree("and"));

        System.out.println("\nTesting withoutEnd2: ");
        System.out.println("Testing Hello: " + Unit1Exercises.withoutEnd2("Hello"));
        System.out.println("Testing abc: " + Unit1Exercises.withoutEnd2("abc"));
        System.out.println("Testing ab: " + Unit1Exercises.withoutEnd2("ab"));

        System.out.println("\nTesting stringEnds");
        System.out.println("Testing Hello, 2: " + Unit1Exercises.stringEnds("Hello", 2));

        System.out.println("\nTesting hasBad:");
        System.out.println("Testing badxx: " + Unit1Exercises.hasBad("badxx"));
        System.out.println("Testing xbadxx: " + Unit1Exercises.hasBad("xbadxx"));
        System.out.println("Testing xxbadxx: " + Unit1Exercises.hasBad("xxbadxx"));

        System.out.println("\nTesting countVowels:");
        System.out.println("Testing Hello: " + Unit1Exercises.countVowels("Hello"));

        System.out.println("\nTesting countCode:");
        System.out.println("Testing cozexxcope: " + Unit1Exercises.countCode("cozexxcope"));

    }
}
