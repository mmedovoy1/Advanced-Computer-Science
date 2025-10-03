public class ConditionalChallenge {

    public static void main(String[] args) {
        System.out.println("-- Part 1: Temperature Converter ---");
        
        double temperature = 60;
        System.out.println("Initial temperature:  " + temperature);
        System.out.println("isCold: true");
        boolean isCold = true; 
        if (isCold = true) {
            temperature = temperature - 15;
        } else if (isCold = false) {
            temperature = temperature + 10;
        }
        System.out.println("New temperature: " + temperature);
         


        System.out.println("--- Part 2: Grade Calculator ---");
        int score = 99;
        System.out.println("Score:  " + score);
        if (score >= 70) {
            System.out.println("Result: Passed");
        } else if (score < 70) {
            System.out.println("Result: Failed");
        }

        System.out.println("--- Part 3: Season Determiner ---");
        int temperature2 = 90; 
        System.out.println("Temperature: " + temperature2);
        System.out.println("Season: ");
        if (temperature2 > 80) {
            System.out.print("Summer");
        } else if (temperature2 >=60 || temperature2 <= 80) {
            System.out.print("Spring");
        } else if (temperature2 >= 40 || temperature2 <= 59) {
            System.out.print("Fall");
        } else if (temperature2 < 40) {
            System.out.print("Winter");
        }
        
        System.out.println("--- Part 4: Number Classifier ---");
        int number = 15;
        System.out.println("Number: " + number);
        System.out.println("Classification: ");
        if (number > 0) {
            System.out.print("Positive");
        } else if (number < 0) {
            System.out.print("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        }
        if (number > 100) {
            System.out.print(", Large");
        } else if (number < -100) {
            System.out.print(", Very Negative");
        }
        
        
        


    }
}