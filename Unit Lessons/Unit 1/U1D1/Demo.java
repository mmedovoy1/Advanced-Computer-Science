public class Demo{
    // private int hello;
    // private int world;
    // /**
    //  * @return the hello
    //  */
    // public int getHello() {
    //     return hello;
    // }




    // /**
    //  * @param hello the hello to set
    //  */
    // public void setHello(int hello) {
    //     this.hello = hello;
    // }




    // /**
    //  * @return the world
    //  */
    // public int getWorld() {
    //     return world;
    // }




    // /**
    //  * @param world the world to set
    //  */
    // public void setWorld(int world) {
    //     this.world = world;
    // }




    // /**
    //  * @return the goodbye
    //  */
    // public String getGoodbye() {
    //     return goodbye;
    // }




    // /**
    //  * @param goodbye the goodbye to set
    //  */
    // public void setGoodbye(String goodbye) {
    //     this.goodbye = goodbye;
    // }




    // private String goodbye;




    public static void main(String args[] ) {
        // AND
        int age = 20;
        boolean isFelon = false;

        if ((age >= 18 && age >= 35) && !isFelon) {
            System.out.println("You can run for presidency and vote!");
        }

        // OR - at least on condition has to be true

        age = 15;

        if(age < 35 || isFelon) {
            System.out.println("This person is not eligble for presidency.");
        }


        if(!(age > 18 || isFelon)) {
            System.out.println("print me");
        }


        // READABLITY IS IMPORTANT

        boolean isRegistered = true;
        boolean isCitizen = true;
        String country = "USA";


        // Guarding If statements
        if (!isRegistered) {
            return;
        }
        if (age < 18) {
            return;
        }
        if (!isCitizen) {
            return;
        }
        if (isFelon) {
            return;
        }
        if (!country.equals("USA")) {
            return;
        }
        System.out.println("You can't vote");

    }
}