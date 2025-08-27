// A class is a collection of related attributes and behaviors

public class HelloWorld {

    // Main -> an entrypoint for your computer to start running code
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("my name is matthew");

        System.out.print("My favorite pizza topping is pineapple.");
        System.out.print(" My facorite drink is a smoothie.");

        // 8 primitive data types
        int number = 5; // integer
        char letter = 'a'; //character
        boolean isTrue = true; // true or false
        float decimal = 50.0f; // 32 bit decimal
        double bigdecimal = 0.6; // 64 bit decimal number
        
        //INT ALTERNATIVES
        byte age = 25;
        long bigInteger = 1000;
        short population = 3200;


        String myName = "matthew"; // String is a CLASS not a primitive data type
        // a collection of primitive characters to describe text

        System.out.println(myName.length());

        // conditional statements
        // if this happens then that happens
        // conditions are always BOOLEAN meaning true/false
        // Example 1
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        //Example 2
        boolean isCompSciFun = true;
        
        if (isCompSciFun == false); {
            System.out.println("Comp Sci Sucks");
        }
        else if (isComSciFun == true) {
            System.out.println("Comp Sci is fun!")
        }

        //Example 2.1
        if (isCompSciFun) {
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out.")
        }

        //Challenge: Write a conditional if-else statement where you do something if you ate 5 apples vs 10, it should print something if neither condition is true.
        
        //Challenge Complete 1
        int appleCount = 3;
        if (appleCount == 5) {
            System.out.println("You ate 5 apples.");
        } else if (appleCount = 10) {
            System.out.println("You ate 10 apples.");
        } else {
            System.out.println("You ate a different amount of apples.");
        }

        //Challenge Complete 2
        if (applecount == 5||)


}


