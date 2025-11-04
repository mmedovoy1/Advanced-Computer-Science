public class AutoUtils {
    public static String fixName(String name) {
        String trimmed = name.trim();
        String firstname = "";
        String lastname = "";
        firstname = name.substring(0, trimmed.indexOf(" "));
        lastname = name.substring(trimmed.indexOf(" ")).trim();
        return firstname + " " + lastname;
    }

    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return 0;
        } else if (cleanlinessLevel > 10) {
            return 10;
        } else {
            return cleanlinessLevel;
        }
    }

    public static String generateUsername(String name) {
        name = fixName(name);
        String firstname = name.substring(0, name.indexOf(" "));
        String lastname = name.substring(name.indexOf(" ")).trim();
        return "@" + firstname + "_" + lastname + "_" + (Math.random() * (1950) + 100);
    }

    public static void cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
    }

}
