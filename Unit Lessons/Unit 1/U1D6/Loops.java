public class Loops {
    public static void main(String[] args) {
        
        int count = 0;
        while (count < 10) {

            System.out.println(count);
            count++;
        }


        // loop2
        boolean isRunning = true;
        while (isRunning) {
            count++;
            if (count == 100) {
                isRunning = false;
            }
        }

        // loop 3
        for (int count2 = 0; count < 10; count2++) {
            System.out.println(count2);
        }

        // a for-loop is best when you know the exact number of iterations (repetitions)
        // a for-lopp is more compact with its syntax

        // a while loop is best when you DON'T know the exact number of repetitions
        // a while loop requires the initialization to be outside of the loop, and the
        // iteration to be updated inside the loop



        // loop 4 - dowhile loops
        do {
            System.out.println("do this first");
            System.out.println("then check condition");

        } while (isRunning);

        //loop 6 - nested loops
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("all wosasawqqwew");
            }
        }

        while(true){
            while(true){
                System.out.println("hello world");
            }
        }

        

    }
}