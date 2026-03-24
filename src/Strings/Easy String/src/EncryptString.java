public class EncryptString {
    public static void main(String[] args) {
        String s ="aaabbbccdeef";
        String result = encryptString(s);
        System.out.println(result);
    }public static String encryptString(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();

        while(i<n){
            char ch = s.charAt(i);
            int count = 0;

            while(i<n && s.charAt(i) == ch ){
                i++;
                count++;
            }

            result.append(ch);
            result.append(count);
        }
        result.reverse();
        return result.toString();
    }
}
