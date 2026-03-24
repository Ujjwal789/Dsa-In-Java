public class FindRepeatMissOp {
    public static void main(String[] args) {
        int[] arr = {2,3,3,5,6,1};
        int[] result = findOp(arr);
        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
    public static int[] findOp(int[] arr){
        long n = arr.length;

        long sn = (n*(n+1)/2);
        long s2n = (n*(n+1)*(2*n+1)/6);

        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long) arr[i] * (long) arr[i];
        }
        long val1 = S - sn; // X - Y

        // S2 - S2n = X^2 - Y^2
        long val2 = S2 - s2n;

        // Calculate X + Y
        val2 = val2 / val1;

        // Calculate X and Y
        long x = (val1 + val2) / 2; // repeating
        long y = x - val1;          // missing

        return new int[]{(int) x, (int) y};
    }
}
