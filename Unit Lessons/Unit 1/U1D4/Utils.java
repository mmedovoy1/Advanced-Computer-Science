public class Utils{

    public static void main(String[] args) {
        
        // A class that contains a list of characters to form words
        // it gives strings methods taht we can use
        String x = "hello";
        String.valueOf("123"); // converts an integer String to int

        int y = 10; // ints are primitimve and Do Not have any methods
       
       // Integer Wrapper
        Integer yWrapper  = 10; // the value 10 has methods now
        yWrapper.toString();
        Integer.parseInt("123"); // converts string to integers

        // Boolean Wrapper
        boolean isFalse = false;
        Boolean isTrue = true;
        isTrue.toString();
        System.out.println(Boolean.parseBoolean("true"));

        // Double Wrapper
        double decimal = 1.1;
        Double decimalWrapper = 1.1;

        System.out.println(Double.parseDouble("13.76"));

    }
}