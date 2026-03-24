public class plaindrome {
    public static void main(String[] args) {
        String str = "abba";
        boolean result = plaindrome(str);
        System.out.println(result);

    }

    public static boolean plaindrome(String str){
        int n = str.length();
        String reve = "";

        for (int i = n-1; i >=0; i--) {
            reve += str.charAt(i);
        }
      if (str.equals(reve)){
          return true;
      }else {
          return false;
      }
    }
}
