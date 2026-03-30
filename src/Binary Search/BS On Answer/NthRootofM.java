public class NthRootofM {
    public static void main(String[] args) {
        int N = 4;
        int M = 69;
        int result = NthRoot(N, M);
        System.out.println("squre root is "  + result);
    }
    public static int NthRoot(int N, int M) {
        int low = 1;
        int high = M;
        int ans = -1;

        while(low<=high){
            int mid = (low +high)/2;

            double val = 1.0;
            for (int i = 0; i < N; i++) {
                val *= mid;
                if (val > M) break; // early stop
            }
            if (val == M) {
                return mid;
            } else if (val < M) {
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return -1;

    }
}
