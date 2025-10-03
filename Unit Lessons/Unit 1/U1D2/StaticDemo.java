public class StaticDemo {

    public static void main(String[] args) {
        
        // if you have no constructor, ill make a default or you and assign all
        // instance variables to their null state
        // StaticDemo object = new Static Demo():

        // object.firstIfTests();

        // static methods are sometimes called helper methods
        // classes that hold static methods only are called helper classes
        String demo = StaticDemo.secondIfTest();

        // you can print on the console without creating a System object
        System.out.println(demo);

        Math.random();

        String.value
    }

    // this method belongs to the object class
    public void firstIfTest(){
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            System.out.println("x is less than y");
        }
        if (x == z) {
            System.out.println("x is to equal to z.");
        }
    }


    public static String secondIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            System.out.println("x is less than y");
        }
        if (x == z) {
            System.out.println("x is to equal to z.");
        }

        return "hello there";
    }
}
