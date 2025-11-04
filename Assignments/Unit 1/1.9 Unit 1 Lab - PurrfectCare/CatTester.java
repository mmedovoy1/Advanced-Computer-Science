public class CatTester {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ryan", "Felice", 4, "1435");
        PurrfectUtils.bootUp(cat1);
        cat1.setCatId("3654");
        System.out.println("\n");
        PurrfectUtils.bootUp(cat1);
        System.out.println("\n");
        Cat cat2 = new Cat();
        PurrfectUtils.bootUp(cat2);
        PurrfectUtils.pet(cat2);
        System.out.println();
        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(cat2);
        }
        System.out.println();
        PurrfectUtils.cleanLitterBox(cat2);
        PurrfectUtils.feed(cat2);


    }

}
