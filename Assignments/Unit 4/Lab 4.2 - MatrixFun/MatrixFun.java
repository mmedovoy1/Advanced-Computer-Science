public class MatrixFun {
    private int numberOfRows;
    private int numberOfCols;
    private int[][] matrix = new int[numberOfRows][numberOfCols];

    public MatrixFun(int numberOfRows, int numberOfCols) {
       this.numberOfRows = numberOfRows;
       this.numberOfCols = numberOfCols;
    }

    public MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
    }

    public MatrixFun() {
        this.numberOfRows = 3;
        this.numberOfCols = 3;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfCols() {
        return numberOfCols;
    }

    public void setNumberOfCols(int numberOfCols) {
        this.numberOfCols = numberOfCols;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString(){
        String toReturn = "";
        int signs = this.getNumberOfCols() * 2 - 1;
        for (int i = 0; i < signs; i++) {
            toReturn += "=";
        }
        toReturn += "\n";
        for (int[] row : matrix) {
            for (int cell : row) {
                toReturn += cell + "\t";
            }
            toReturn += "\n";
        }
        for (int i = 0; i < signs; i++) {
            toReturn += "=";
        }
        return toReturn;
    }

    public boolean equals(MatrixFun other) {

    }
}
