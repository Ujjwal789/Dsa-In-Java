public class ReturnMaxFreq {
    public static void main(String[] args) {
        String s = "hello World";
        char result = getMax(s);
        System.out.println(result);
    }
    public static char getMax(String s){
        int maxCount = 0;
        char result = s.charAt(0);
        int n = s.length();
        for (int i = 0; i <n ; i++) {
            char ch = s.charAt(i);
            int count = 0;
          for (int j = 0; j <n; j++) {
            if (s.charAt(j) == ch){
                count++;
            }
                
          }
          if(count>maxCount || (count ==maxCount &&  ch <result)){
              maxCount = count;
              result = ch;
          }
        }
        return result;
    }
}
