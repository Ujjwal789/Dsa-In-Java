import java.util.Scanner;

public class Strings {
//    public  static int findLength(String s){
//        return s.length();
//    }
//
//    public static void main(String[] args) {
//        String s = "hello Duniya";
//
////        Strings obj = new Strings(); //use obj if not use static in main clas
//        System.out.println(findLength(s));
//
//    }


    // Finding lenth of string
//    static class solution {
//        public void Accesscharcter(String s) {
//            for (int i = 0; i < s.length(); i++) {
//                System.out.println((s.charAt(i)));
//
//
//            }
//        }
//
//        }
//
//        public static void main(String[] args) {
//            solution obj = new solution();
//            String s = "hello brother";
//
//            obj.Accesscharcter((s));
//        }

//
//   static class Solution{
//        public String modify(String s){
//            String newstr = s;
//
//            return " hello" + s ;
//        }
//    }
//
//
//        public static void main(String[] args) {
//             String orignalstr ="world";
//             Solution sol = new Solution();
//
//             String result = sol.modify(orignalstr);
//
//            System.out.println("orignalstr " +  orignalstr);
//            System.out.println("modifystr  "  +  result);
//
//
//        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        String str1 = sc.next();
        String str2 = sc.next();

        Solution obj = new Solution();

        if(obj.comapareStrings(str1, str2))
            System.out.println("equal");
        else
            System.out.println("not equal");





    }

    static class Solution {
        public boolean comapareStrings(String str1, String str2){
            return str1.equals(str2);
        }

    }

}
