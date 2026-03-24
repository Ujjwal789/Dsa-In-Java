public class Isomorphich {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "xyzz";

        boolean result = areIsomorphic(s1, s2);
        System.out.println(result);
    }
    public static boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        int[] maps = new int[256];
        int[] mapt = new int[256];

        for(int i =0; i<s1.length(); i++){
            char cs = s1.charAt(i);
            char ts = s2.charAt(i);

            if(maps[cs] != mapt[ts]){
                return false;
            }

            maps[cs] = i + 1;
            mapt[ts] = i + 1;

        }
        return true;

    }
}
