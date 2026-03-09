import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

class Plaindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter text");
        String s1 = sc.next();
        Plain  p = new Plain();

        if(p.check(s1)){
            System.out.println("plaindrome");
        }else {
            System.out.println("not a plaindrome");
        }

    }

}
class Plain{
    boolean check(String s1) {
       int p1 = 0;
       int p2 = s1.length() -1;

       while(p1<p2){
           if (s1.charAt(p1) != s1.charAt(p2)) {
               return false;
           }
           p1++;
           p2--;
       }
       return true;

   }
}
