public class MatrixFun {
    private int numberOfRows;
    private int numberOfCols;
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
       this.numberOfRows = numberOfRows;
       this.numberOfCols = numberOfCols;
       this.matrix = new int[numberOfRows][numberOfCols];
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
        int signs = ((this.getNumberOfCols() * 2) - 1);
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
        if (matrix[0].length != other.getMatrix()[0].length && matrix.length != other.getMatrix().length) {
            return false;
        }
        boolean doesEqual = true;
        int count = -1;
        for (int[] row : matrix) {
            count += 1;
            for (int cell : row) {
                if (matrix[count][cell] != other.getMatrix()[count][cell]) {
                    return false;
                }
            }
        }
        return doesEqual;
    }

    public boolean equals(int[][] other) {
        if (matrix[0].length != other[0].length && matrix.length != other.length) {
            return false;
        }
        boolean doesEqual = true;
        int count = -1;
        for (int[] row : matrix) {
            count += 1;
            for (int cell : row) {
                if (matrix[count][cell] != other[count][cell]) {
                    return false;
                }
            }
        }
        return doesEqual;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        int[][] matrix2 = matrix;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][rowA] = matrix[i][rowB];
            matrix[i][rowB] = matrix2[i][rowB];
        }
    }
}
