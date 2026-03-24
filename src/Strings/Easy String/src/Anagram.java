import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "abbzsa";
        String str2 = "aszbab";

        System.out.println(Anagram(str, str2));
    }
    public static boolean Anagram(String str, String str2){
        if(str.length() != str2.length()){
            return false;

        }
        char[] a = str.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}
