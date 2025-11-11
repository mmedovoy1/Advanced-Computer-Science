public class ArrayDemo{

    public static void main(String[] args) {

        // Pokemon
        // you have a team of 6, index is max of 5

        // Pokemon[] team = new Pokemon[6];
        // {0, 1, 2, 3, 4, 5} ordered list

        // tream[3] = new Pokemon("Charizard");
        // {0, 1, 2, "Charizard", 4, 5}

        // this code created a list of size 6, so the max index is 5

        // Pokemon[] box = new Pokemon[30];

        // Pokemon [] box2 = new Pokemon[1000];

        int[] myFavoritenumber = new int[4];
        // my favorite number sub 0
        myFavoritenumber[0] = 7;
        myFavoritenumber[1] = 8;
        myFavoritenumber[2] = 13;
        myFavoritenumber[3] = 5;

        // {6, 7, 13, 5}

        myFavoritenumber[0] = 6;

        // {6, 8, 13 5}
        
        System.out.println(myFavoritenumber[3]);

        // print out the entire list using a for loop

        for (int i = 0; i < myFavoritenumber.length; i++) {
            System.out.println(myFavoritenumber[i]);
        }

        System.out.println(myFavoritenumber.length);

        // what if I actually have five favorite numbers

        // list sizers are immutable <- cant change it without creating a new object
        // String are a list (array) of characters! They are also immutable.
        // {'h', 'e', 'l', 'l', 'o'}

        // String[] beatles = new String[4];
        // beatles[0] = "John"; 
        // beatles[2] = "Paul";

        String[] beatles = {"john", "paul", null, "ringo"};

        // challenge: update the list to include you as the fifth beatle

        for (int i = 0; i < beatles2.length; i++) {
            if (beatles[i] != null) {
                System.out.println(beatles[i].length());
            } else {
                System.out.println("This element is null");
            }
        }

        int[] number = new int[3];
        // {0, 0, 0}

        boolean[] trust = new boolean[3];
        // {false, false, false}

        String[] list = new String[3];
        // {null, null, null}

        // Pokemon[] team = new Pokemon [3];
        // {null, null, null}
    }
}