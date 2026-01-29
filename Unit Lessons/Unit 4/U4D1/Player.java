public class Player {
    private int health;
    private String name;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Player(String name) {
        this(name, 200);
    }

    public Player() {
        this("Jim", 200);
    }


    // OVERLOADING
    // happens when you have the same method name but different parameters

    public void eat(Food food) {
        health += food.getQuality();
        System.out.println(name + " ate  food.");
        System.out.println(name + " has " + health + "hp");
    }

    public void eat(Rock rock) {
        System.out.println(name + " ate rocks!");
        health -= 100;
        System.out.println(name + " has " + health + "hp");
    }
    public static void main(String[] args) {
        Player player = new Player("Matthew", 100);
        Food sushi = new Food("sushi", 20);
        player.eat(sushi);

        Food pizza = new Food("pizza", 15);
        player.eat(pizza);


        System.out.println(5);
        System.out.println("hello");
        System.out.println('x');
        System.out.println(true);
    }
}
