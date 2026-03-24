import java.util.HashMap;
import java.util.Map;

public class RomanIntoNumber {
    public static void main(String[] args) {
        String s = "MLCIV";
        int result = romanToDecimal(s);
        System.out.println(result);

    }public static int romanToDecimal(String s) {
        // code here
        int prv = 0;
        int ans = 0;

        Map<String, Integer> value = new HashMap<>();
        value.put("I", 1);
        value.put("V", 5);
        value.put("X", 10);
        value.put("L", 50);
        value.put("C", 100);
        value.put("D", 500);
        value.put("M", 1000);

        for(int i =s.length()-1; i>=0; i--){
            int curr = value.get(String.valueOf(s.charAt(i)));

            if(curr<prv){
                ans -= curr;
            }else{
                ans += curr;
            }

            prv = curr;
        }

        return ans;

    }
}
