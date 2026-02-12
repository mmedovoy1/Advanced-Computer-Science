public class MatrixFun {
    private int numberOfRows;
    private int numberOfCols;
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfCols < 0 || numberOfRows < 0) {
            throw new IllegalArgumentException("dimensions can't be less than 0");
        }
        this.numberOfRows = numberOfRows;
        this.numberOfCols = numberOfCols;
        this.matrix = new int[numberOfRows][numberOfCols];
    }

    public MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
        this.numberOfCols = matrix[0].length;
        this.numberOfRows = matrix.length;
    }

    public MatrixFun() {
        this.numberOfRows = 3;
        this.numberOfCols = 3;
        this.matrix = new int[numberOfRows][numberOfCols];
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

    public String toString() {
        String toReturn = "";
        int signs = ((this.getNumberOfCols() * 2) - 1);
        for (int i = 0; i < signs; i++) {
            toReturn += "=";
        }
        toReturn += "\n";
        for (int[] row : matrix) {
            for (int cell : row) {
                toReturn += cell + " ";
            }
            toReturn += "\n";
        }
        for (int i = 0; i < signs; i++) {
            toReturn += "=";
        }
        return toReturn;
    }

    public boolean equals(MatrixFun other) {
        if (other == null) {
            return false;
        }
        if (matrix.length != other.getMatrix().length
                || matrix[0].length != other.getMatrix()[0].length) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != other.getMatrix()[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(int[][] other) {
        if (matrix.length != other.length || matrix[0].length != other[0].length) {
            return false;
        }
        boolean doesEqual = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != other[i][j]) {
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
        if (rowA < 0 || rowB < 0 || rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("row A or row B < 0");
        }
        int[] toSwap = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = toSwap;
    }
}
