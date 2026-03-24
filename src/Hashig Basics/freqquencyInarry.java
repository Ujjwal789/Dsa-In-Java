import java.util.*;

public class freqquencyInarry {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Take array input
    System.out.println("enter the array size");
    int n = sc.nextInt();
    int[] arr = new int[n];

    //precompute frequency using hashmap in array
    HashMap<Integer, Integer> hash = new HashMap<>();

    //input array
    System.out.println("enter the array ");
    for (int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
      hash.put(arr[i],hash.getOrDefault(arr[i], 0) +1 );
    }

    while (true) {
      System.out.println("Enter number to check frequency (-1 to stop):");
      int number = sc.nextInt();

      if (number == -1) {
        break;
      }    System.out.println("Frequency: " + hash.getOrDefault(number, 0));
    }

    sc.close();
  }


}