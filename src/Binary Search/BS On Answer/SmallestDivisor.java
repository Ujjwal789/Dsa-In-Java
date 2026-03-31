import java.util.Arrays;

public class SmallestDivisor {
    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        int result = smallestDivisor(nums, threshold);
        System.out.println("Smallest Divisor: " + result);
    }
    private static int sumByD(int[] arr, int div) {
        int sum = 0;
        for(int num : arr){
            sum += Math.ceil((double) num / div);
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        if (nums.length > threshold) return -1;
        int max = Arrays.stream(nums).max().getAsInt();
        int low = 1;
        int high = max;


        while(low<=high){
            int mid = (low + high)/2;
            if((sumByD(nums, mid) <= threshold)){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
}
