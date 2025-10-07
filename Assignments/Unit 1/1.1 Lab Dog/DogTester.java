public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Justin", "Morgan", 7, 826, true);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Bob", "Jeff", 4, 963, true);

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        dog1.setAge(3);
        dog1.setDogId(741);
        System.out.println(dog1.toString());


        System.out.println(Dog.generateDogChar(dog1.getDogId()));
        dog2.setDogId(123);
        System.out.println(Dog.generateDogChar(dog2.getDogId()));
        dog3.setDogId(693);
        System.out.println(Dog.generateDogChar(dog3.getDogId()));

        System.out.println(dog1.equals(dog2));

        dog1.setStillInFacility(false);
        System.out.println(dog1.toString());

        System.out.println(Dog.pickup(dog1, "Matthew"));
        System.out.println(Dog.pickup(dog2, "Owen"));
        System.out.println(Dog.checkIn(dog1, "Matthew"));
    }
}
