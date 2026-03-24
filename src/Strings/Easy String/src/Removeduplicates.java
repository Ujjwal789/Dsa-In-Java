public class Removeduplicates {
    public static void main(String[] args) {
     String s = "GeeksForGeeKShhhal";

     String result = removeDuplicates(s);
        System.out.println(result);
    }public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        boolean[] seen = new boolean[256];

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!seen[ch]){
                seen[ch] = true;
                result.append(ch);
            }
        }

        return result.toString();
    }
}
