public class Utils {
    public static void printMatrix(int[][] table) {
        for (int[] row : table) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    public static String printStringArray(String[] array) {
        String toprint = "{";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                toprint += array[i] + ", ";
            } else {
                toprint += array[i] + "}";
            }
        }
        return toprint;
    }

    public static String printIntArray(int[] array) {
        String toprint = "{";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                toprint += array[i] + ", ";
            } else {
                toprint += array[i] + "}";
            }
        }
        return toprint;
    }


}

