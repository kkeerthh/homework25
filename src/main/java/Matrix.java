public class Matrix {
    public static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rows) {
                return false;
            }
        }
        return true;
    }
}
