public class RemoveCharcter {
    public static void main(String[] args) {
        String s = "SkyBluejsaajnja@595654";
        String result = removeSpecialCharacter(s);
        System.out.println(result);
    }
    public static String  removeSpecialCharacter(String s) {
        // code here
        StringBuilder result = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetter(ch)){
                result.append(ch);
            }
        }
        if (result.length() == 0) {
            return "-1";
        }

        return result.toString();
    }
}
