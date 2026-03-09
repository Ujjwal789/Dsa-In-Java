import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args) {
    // THIS ALGO NOT WORK IN BIG INPUT TIME LIMIT
        Scanner sc = new Scanner(System.in);
        int[] nums ={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        for(int i  =0; i<n; i++){
            for(int j  =i +1; j<n; j++){
                int maxp = prices[j] - prices [i];
                if(maxp> max){
                    max = maxp;
                }

            }
        }
        return max;

    }

}
