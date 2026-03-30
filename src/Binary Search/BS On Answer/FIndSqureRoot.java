public class FIndSqureRoot {
    public static void main(String[] args) {
        int n = 36;
        int result = floorSqrt(n);
        System.out.println("squre root is "  + result);
    }
    public static int floorSqrt(int n) {
        int low = 0;
        int high = n - 1;
        int ans = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
