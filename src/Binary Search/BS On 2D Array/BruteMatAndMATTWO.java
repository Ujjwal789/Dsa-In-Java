public class BruteMatAndMATTWO {
    public static void main(String[] args) {
        int [][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 45;
        boolean result = searchMatrix(matrix,target);
        System.out.println(result);

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;
    for(int i =0; i<n; i++){
        for(int j =0; j<m; j++){
            if(matrix[i][j]== target){
                return true;
            }
        }
    }
    return false;

}
}
