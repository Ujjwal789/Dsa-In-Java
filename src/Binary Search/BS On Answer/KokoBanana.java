import java.util.Arrays;

public class KokoBanana {
    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum Eating Speed: " + result);
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = maxPile;
        while(low<=high){
            int mid = (low + high)/2;
            long totalH = hours(piles, mid);
            if(totalH <= h){
                high = mid -1;
            }else{
                low = mid +1;
            }

        }
        return low;

    }
    public static long hours(int[] piles, int speed){
        long totalH = 0;
        for (int pile : piles) {
            totalH += (pile + speed - 1) / speed;
        }
        return totalH;
    }
}
