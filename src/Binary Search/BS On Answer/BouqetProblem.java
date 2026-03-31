import java.util.Arrays;

public class BouqetProblem {
    // PSVM (main method)
    public static void main(String[] args) {
        BouqetProblem obj = new BouqetProblem();

        int[] bloomDay = {7, 7, 7, 7, 13,12,11,7};
        int m = 2; // number of bouquets
        int k = 3; // flowers per bouquet

        int result = obj.minDays(bloomDay, m, k);

        System.out.println("Minimum days required: " + result);
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowers = (long) m * k;
        if (totalFlowers > bloomDay.length) return -1;

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {
                high = mid - 1; // try smaller day
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    public boolean isPossible(int[]bloomDay, int day, int m, int k){
        int count =0;
        int bouqet =0;
        for(int bloom: bloomDay){
            if(bloom<= day){
                count++;
                if(count == k){
                    bouqet++;
                    count = 0;
                }
            }else{
                count = 0;
            }

        }
        return bouqet >= m;
    }
}
