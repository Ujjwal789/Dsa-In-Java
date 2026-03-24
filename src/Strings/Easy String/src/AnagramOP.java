public class AnagramOP {
    public static void main(String[] args) {
        String s1 = "abbzsa";
        String s2 = "aszbba";
        System.out.println(AnagramOp(s1, s2));
    }

    public static boolean AnagramOp(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int [] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0){
              return false;
            }
        }
        return true;
    }
}
