public class RemoveVowels {
    public static void main(String[] args) {
       String str1 = "SkyBluejsaajnja";
        String result = vowel(str1);
        System.out.println(result);
    }
    public static String vowel(String str1){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if("aeiouAEIOU".indexOf(ch) == -1){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
