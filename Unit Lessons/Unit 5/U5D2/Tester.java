import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.toString());

        Rottweiler rottweiler = new Rottweiler();
        System.out.println(rottweiler.toString());

        Shitzu shitzu = new Shitzu();

        ArrayList<Dog> list = new ArrayList<>();



    }
    // Dog dog = new Rottweiler Yes
    // Rorrweiler dog = new Dog NO
    // Polymorphism:
    //  Roettweiler dog = new Dog
    //  (Rottweiler)dog

}
