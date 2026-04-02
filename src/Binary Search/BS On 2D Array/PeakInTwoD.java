public class PeakInTwoD {

        public  static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3, 1, 8},
                    {2, 3, 4, 5, 6}
            };

            int[] res = findPeakGrid(mat);

            System.out.println("Peak at: row = " + res[0] + ", col = " + res[1]);
        }

    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m-1;
        while(low<=high){
            int mid = (low + high)/2;
            int row = 0;
            for (int i = 0; i < n; i++) {
                if (mat[i][mid] > mat[row][mid]) row = i;
            }

            int left = mid > 0 ? mat[row][mid - 1] : Integer.MIN_VALUE;
            int right = mid < m - 1 ? mat[row][mid + 1] : Integer.MIN_VALUE;

            if (mat[row][mid] > left && mat[row][mid] > right)
                return new int[]{row, mid};
            else if (left > mat[row][mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return new int[]{-1, -1};
    }
}
