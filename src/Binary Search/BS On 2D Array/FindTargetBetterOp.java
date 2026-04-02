public class FindTargetBetterOp {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,},{4,5,6},{7,8,9}};
        int target = 8;
        boolean result = searchMatrix(matrix,target);
        System.out.println(result);

    }
    public static boolean binarySearch(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int mid = (low +high)/2;
            if (nums[mid] == target)
                return true;
            else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
                    // Perform binary search on this row
                    return binarySearch(matrix[i], target);
                }
            }
        }
        return false;

    }
}
