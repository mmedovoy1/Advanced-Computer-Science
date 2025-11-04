public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7 && cat.getMoodLevel() <= 10) {
            return ("Currently, " + cat.getName() + "is in a great mood.\nPetting is appreciated.");
        } else if (cat.getMoodLevel() > 3 && cat.getMoodLevel() <= 7) {
            return ("Currently, " + cat.getName()
                    + "is reminiscing of a past life.\nPetting is acceptable.");
        } else {
            return ("Currently, " + cat.getName()
                    + " is plotting revengeance.\nPetting is extremely risky.");
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            String digitStr = catId.substring(i, i + 1);
            int digit = Integer.parseInt(digitStr);
            sum += digit;
        }
        int toGenerate = sum % 26;
        return (char) (toGenerate + 'A');
    }

    public static int generateRandomNumber(int low, int high) {
        if (high < low) {
            int num = low;
            low = high;
            high = num;
        }
        return (int) (Math.random()) * low + (high - low);
    }

    public static String validateCatId(String catId) {
        int num = Integer.parseInt(catId);
        if (num >= 1000 && num <= 9999) {
            return catId;
        } else {
            return "" + generateRandomNumber(1000, 10000);
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet. . . ");
        int mood = cat.getMoodLevel();
        if (mood >= 2) {
            cat.setMoodLevel(mood + 1);
        } else if (mood < 2 && cat.isHungry == true) {
            cat.setMoodLevel(mood - 1);
        } else {
            cat.setMoodLevel(mood + 1);
        }
        if (mood < cat.getMoodLevel()) {
            System.out.println("Petting successful!");
        } else if (cat.getMoodLevel() < mood) {
            System.out.println("Petting failed. . .");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws. . .");
        int num = generateRandomNumber(1, 3);
        if (num == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that. . .");
        } else if (num == 2) {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println(
                "Cleaning the litter box. . .\nDone!\n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println(
                "Filling up " + cat.getName() + "'s bowl. . .\nDone!\nCookie is eating. . .");
        System.out.println(cat.getName() + " is full!");
    }
}
