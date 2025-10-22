public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Justin", "Morgan", 7, 826);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Bob", "Jeff", 4, 963);
        // Dog dog4 = new Dog("Ryan", "Daniel", 9, 456);

        System.out.println("Dog1: " + dog1.toString());
        System.out.println("\nDog2: " + dog2.toString());
        System.out.println("\nDog3: " + dog3.toString());

        dog1.setAge(3);
        dog1.setDogId(741);
        System.out.println("\nNew Dog1 with age set to 3 and id set to 741: " + dog1.toString());


        System.out.println(PawesomeUtils.generateDogChar(dog1.getDogId()));
        dog2.setDogId(123);
        System.out.println(PawesomeUtils.generateDogChar(dog2.getDogId()));
        dog3.setDogId(693);
        System.out.println(PawesomeUtils.generateDogChar(dog3.getDogId()));

        System.out.println(dog1.equals(dog2));

        dog1.setStillInFacility(false);
        System.out.println(dog1.toString());

        System.out.println(PawesomeUtils.pickup(dog1, "Matthew"));
        System.out.println(PawesomeUtils.pickup(dog2, "Owen"));
        PawesomeUtils.checkIn(dog1, "Matthew");
        System.out.println(dog3.isStillInFacility() + ", " + dog3.getOwnerName()); // should return false, Daniel

        System.out.println(PawesomeUtils.validateDogId(258)); // should return 258
        System.out.println(PawesomeUtils.validateDogId(47)); // should return random 3 digit number

        System.out.println(PawesomeUtils.validateDogTag(dog1));
        System.out.println(PawesomeUtils.validateDogTag(dog2));
        System.out.println(PawesomeUtils.validateDogTag(dog3));

        System.out.println(PawesomeUtils.checkIn(dog1, "Matthew"));

        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog1));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog2));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog3));


        System.out.println(PawesomeUtils.convertAgeToDogYears(10));
        System.out.println(PawesomeUtils.convertAgeToDogYears(17));
        System.out.println(PawesomeUtils.convertAgeToDogYears(49));


    }
}
