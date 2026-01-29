public class ForEachDemo {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };


        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        // for each number in the list x
        for (int number : x) {
            System.out.println(number);
        }

        String[] names = {"B", "L", "A"};
        for (String name : names) {
            System.out.println("hello " + name);
        }

        for(String name : names) {
            name = "hello " + name; // for each loops don't work when modifying immutable datat types like Strings
        }
    }

}