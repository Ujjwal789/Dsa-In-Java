public class plaindromeOP {
    public static void main(String[] args) {
        String str = "abbzsa";
        boolean result = plaindromeop(str);
        System.out.println(result);

    }
    public static boolean plaindromeop(String str){
        int i = 0;
        int j = str.length() - 1;

        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
