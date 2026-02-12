public class MatrixFunTester {
    public static void main(String[] args) {
        int[][] table = {{1, 2, 3}, {4, 5, 6}};
        MatrixFun matrix = new MatrixFun(table);
        System.out.println(matrix.toString());
        matrix.swapRow(0, 1);
        System.out.println(matrix.toString());
        int[][] chart = {{1, 2, 3}, {4, 5, 6}};
        MatrixFun matrix2 = new MatrixFun(chart);
        System.out.println(matrix.equals(matrix2));
    }

}
