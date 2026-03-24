public class RemoveStr2 {
    public static void main(String[] args) {
        String str1 = "SkyBluejsaajnja";
        String str2 = "Blue";
        String result = Rm(str1, str2);  // Call the method
        System.out.println(result);         // Output the result
    }
    public static String Rm(String str1, String str2){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if(str2.indexOf(ch) == -1){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
