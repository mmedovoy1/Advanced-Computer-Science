public class MatricesDemo {
    public static void main(String[] args) {
        int[][] table = new int[3][4];
        table[1][2] = 50;
        for (int[] row : table) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

        // irregulat matrix, the rows are not he same length, so be careful accessing their values!
        int[][] fun = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 }};
        System.out.println(fun[1][2]);
        int[][][] funtothemax = new int[3][3][3]; // 27 cells
    }
}
