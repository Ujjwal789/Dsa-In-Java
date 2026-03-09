public class RotateMatrix {
    public static void main(String[] args) {
        int[][]  matrix =
                {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int [][] rotated = roMatrix(matrix);
        for (int[] row : rotated) {
            for (int val : row)
            System.out.print(val +"");
            System.out.println();
        }
    }

    public static int[][] roMatrix(int[][] matrix){
        int n = matrix.length;
        int [][] rotated = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n-1-i] = matrix[i][j];
            }
        }
        return rotated;

    }
}
