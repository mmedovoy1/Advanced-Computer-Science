public class PawesomeUtils {
    public static int generateRandomNumberBetween(int low, int high) {
        return (int) (Math.random() * (high - low)) + low;
    }


    public static char generateDogChar(int dogId) {
        int digitSum = (dogId % 10) + ((dogId / 10) % 10) + ((dogId / 100) % 10);
        return (char) ('F' + (digitSum % 10));
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.isStillInFacility() && dog.getOwnerName().equals(personName)) {
            return ("Dog picked up successfully.");
        } else {
            return "Dog still in facility";
        }
    }

    public static String checkIn(Dog dog, String personName) {
        if (validateDogTag(dog) == false) {
            dog.setStillInFacility(false);
            return ("Denied Entry");
        } else {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
            return ("Successfully Checked In");
        }
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return ("" + dogId + dogChar);
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return (dogId);
        } else {
            return (generateRandomNumberBetween(100, 999));
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        int validatedDogId = validateDogId(dogId);
        char dogChar = generateDogChar(validatedDogId);
        String newDogTag = (generateDogTag(validatedDogId, dogChar));
        return (newDogTag.equals(dog.getDogTag()));
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return (24 + ((dog.getAge() - 2) * 5));
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears > 15 && humanYears <= 24) {
            return 2;
        } else {
            return (((humanYears - 24) / 5) + 2); 
        }
    }

}
