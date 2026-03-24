public class CountSubarrayXor {

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int x = 6;

        System.out.println(Subarray(arr, x));
    }


    public static int Subarray(int[] arr, int x){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j <n; j++) {
                xor = xor ^ arr[j];
                if (xor == x){
                    count++;
                }
            }

        }
        return count;
    }
}
