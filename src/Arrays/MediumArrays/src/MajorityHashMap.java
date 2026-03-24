import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums ={7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(HMajority(nums));
    }
    public static int HMajority(int [] nums){
        int n = nums.length;
        HashMap<Integer,Integer> map =new HashMap<>();

        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
