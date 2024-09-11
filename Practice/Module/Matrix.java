package Module;

public class Matrix {
    int rows;
    int columns;
    int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
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

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);

        matrix.setElement(0, 0, 1);
        matrix.setElement(0, 1, 2);
        matrix.setElement(0, 2, 3);
        matrix.setElement(1, 0, 4);
        matrix.setElement(1, 1, 5);
        matrix.setElement(1, 2, 6);
        matrix.setElement(2, 0, 7);
        matrix.setElement(2, 1, 8);
        matrix.setElement(2, 2, 9);

        matrix.display();
    }
}
