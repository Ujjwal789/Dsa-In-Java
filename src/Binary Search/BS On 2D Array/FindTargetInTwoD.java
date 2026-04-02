public class FindTargetInTwoD {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,},{4,5,6},{7,8,9}};
        int target = 11;
        boolean result = searchMatrix(matrix,target);
        System.out.println(result);

    }
    public static boolean searchMatrix(int [][] matrix, int target){

            int m = matrix.length;
            int n = matrix[0].length;

            int low = 0;
            int high = n*m-1;
            while (low<high){
                int mid = (low+high)/2;

                int row = mid/m;
                int col = mid%m;

                if(matrix[row][col]==target){
                    return true;
                } else if (matrix[row][col]>target) {
                    high = mid-1;

                }else {
                    low = mid +1;
                }
            }
            return false;
        }
}
