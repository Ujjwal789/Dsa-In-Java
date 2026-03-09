import java.util.HashMap;

public class SubArraySumKO {

        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 4};
            int k = 6;
            int result = subarraySum(arr, k);
            System.out.println("The number of subarrays is: " + result);
        }
    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        prefixSumCount.put(0, 1);

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int remove = prefixSum - k;
            if (prefixSumCount.containsKey(remove)) {
                count += prefixSumCount.get(remove);
            }
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}


