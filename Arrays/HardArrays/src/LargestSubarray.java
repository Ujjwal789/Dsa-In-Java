import java.util.HashMap;
import java.util.List;

public class LargestSubarray {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int ans = maxLen(arr);
        System.out.println("Largest zero sum subarray length: " + ans);
    }



    public static int maxLen(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        int maxi = 0;
        int sum = 0;

        for(int i  = 0; i<n; i++){
            sum += arr[i];
            if(sum == 0){
                maxi = i +1;

            }
            else{
                if(mpp.get(sum) != null){
                    maxi = Math.max(maxi, i -mpp.get(sum));
                }else{
                    mpp.put(sum, i);
                }
            }
        }

        return maxi;
    }
}
