public class SkyView {
    private double[][] view;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("row and col have to be > 0");
        }
        if (numberOfRows * numberOfCols < scanned.length) {
            throw new IllegalArgumentException("need more space in double[][] view");
        }
        this.view = new double[numberOfRows][numberOfCols];
        int scanIndex = 0;
        for (int i = 0; i < numberOfRows && scanIndex < scanned.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numberOfCols && scanIndex < scanned.length; j++) {
                    view[i][j] = scanned[scanIndex];
                    scanIndex++;
                }
            } else {
                for (int j = numberOfCols - 1; j >= 0 && scanIndex < scanned.length; j--) {
                    view[i][j] = scanned[scanIndex];
                    scanIndex++;
                }
            }
        }
    }



    public String toString() {
        String toPrint = "";
        for (double[] row : view) {
            for (double cell : row) {
                toPrint += cell + " ";
            }
            toPrint += "\n";
        }
        return toPrint;
    }

    public boolean equals(SkyView other) {
        if (other == null || view.length != other.view.length
                || view[0].length != other.view[0].length) {
            return false;
        }
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[0].length; j++) {
                if (view[i][j] != other.view[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || startRow > endRow || endRow >= view.length || startCol < 0
                || startCol > endCol || endCol >= view[0].length) {
            throw new IllegalArgumentException("incorrect indices");
        }
        int count = 0;
        double total = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                count++;
                total += view[i][j];
            }
        }
        return total / count;
    }



    public double[][] getView() {
        return view;
    }



    public void setView(double[][] view) {
        this.view = view;
    }


}
