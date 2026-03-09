import java.util.HashMap;
import java.util.Map;

public class CountSubArrayXorOP {

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int x = 6;

        System.out.println(SubarrayOP(arr, x));
    }

    public  static int SubarrayOP(int[] arr, int x){
        Map<Integer, Integer> frq = new HashMap<>();
        frq.put(0,1);
        int count = 0;
        int prefix=0;
        for (int num : arr){
            prefix ^= num;
            int target =  prefix ^ x;
            if (frq.containsKey(target)){
                count += frq.get(target);
            }
            frq.put(prefix,frq.getOrDefault(prefix, 0) + 1);
        }
        return count;

    }
}
