import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MinMax {
    public static void main(String[] args) {
        frequency fc = new frequency();
        Scanner sc = new Scanner(System.in);
        // Take array input
        System.out.println("enter thr size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        //input array
        System.out.println("enter the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        fc.Frequency(arr, arr.length);

    }
}
class frequency{
    public void Frequency(int [] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>(); //store element frequency

        for (int i = 0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        //tranverse map to find min or max
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }


        // Print results
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);


    }

}
