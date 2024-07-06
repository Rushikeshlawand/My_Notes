package Module;

public class Matrix2 {

    private int rows;
    private int columns;
    private int[][] elements;

    public void Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int row, int column, int value) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            elements[row][column] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
    }

    public int getElement(int row, int column) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            return elements[row][column];
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            System.out.println("Matrices cannot be added. Dimensions do not match.");
            return null;
        }

        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

}
