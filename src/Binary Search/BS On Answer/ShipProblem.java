import java.util.Arrays;

public class ShipProblem {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        int result = sipminimumdays(weights, d);
        System.out.println(result);
    }
    private static int daysneeded(int [] weights, int capicty){
        int days = 1;
        int load = 0;
        for(int w : weights){
            if(load + w > capicty){
                days++;
                load = w;
            }else {
                load += w;
            }

        }
        return days;
    }
    public static int sipminimumdays(int [] weights, int d){
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();


        while (low<=high){
            int mid = (low + high)/2;
            int need = daysneeded(weights,mid);

            if(need<=d){
                high = mid-1;
            }else {
                low = mid+1;
            }

        }
        return low;

    }
}
