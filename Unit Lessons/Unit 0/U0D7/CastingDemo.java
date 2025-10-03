public class CastingDemo{

    public static void main(String[] args) {
        
        // implicit casting
        // storing smaller data types into larger ones
        // happens automatically

        int smallNumber = 100
        long bigNumber = smallNumber; // int to long
        float decimalNumber = bigNumber; // long to float
        double largeDecimal = decimalNumber; // float to double

        // Explicit Casting
        // we're manually converting a data type, usually to a different data type that
        // may incur data loss

        double pi = 3.14159
        int engineerPi = (int) pi;
        System.out.println(engineerPi); // truncation - you lost all decimals
        pi = engineerPi
        System.out.println(pi);

        long population = 300L;
        int limitedPopulation = (int) population;
        System.out.println("population: " + limited population)

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        int letterA = 'a'
        System.our.println(letterA + 3)

        // there is no implicit or explicit casting between booleans and integers

        // we're not gonna talk about casting object classes
    }
}