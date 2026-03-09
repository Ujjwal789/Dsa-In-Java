import java.util.Scanner;

public class BuySellStockB {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int[] prices ={7,1,5,3,6,4};
        System.out.println(maxProfitB(prices));
    }
    public static int maxProfitB(int[] prices){
        // Initialize the minimum price to a large number
        int minPrice = Integer.MAX_VALUE;

        // Initialize the maximum profit to 0
        int maxProfit = 0;

        // Traverse each price in the array
        for (int price : prices) {
            // If current price is less than minPrice, update minPrice
            if (price < minPrice) {
                minPrice = price;
            }
            // Else calculate profit and update maxProfit if it's greater
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        // Return the maximum profit found
        return maxProfit;
    }
}