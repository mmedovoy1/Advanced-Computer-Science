public class ConditionalChallenge {

    public static void main(String[] args) {
        double temperature = 60;
        boolean isCold = true; 
        if (isCold = true) {
            temperature = temperature - 15;
        } else if (isCold = false) {
            temperature = temperature + 10;
        }
        System.out.println(temperature); 

        System.out.println("-- Part 1: Temperature Converter ---");

        int score = 99;
        if (score >= 70) {
            System.out.println("Passed");
        } else if (score < 70) {
            System.out.println("Failed");
        }
        System.out.println(score)

        int temperature2 = 90; 
        System.out.println(temperature2)
        if (temperature2 > 80) {
            System.out.println("Summer");
        } else if (temperature2 >=60 || temperature2 <= 80) {
            System.out.println("Spring");
        } else if (temperature2 >= 40 || temperature2 <= 59) {
            System.out.println("Fall");
        } else if (temperature2 < 40) {
            System.out.println("Winter");
        }

        int number = 15
        
        
        


    }
}