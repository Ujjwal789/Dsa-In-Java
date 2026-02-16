import java.util.Scanner;
public class Plaindrome {
    public static void main(String[] args) {
        Sol p = new Sol();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your word");
        String str = sc.next();
        if (p.plain( 0, str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }



    }

}
class Sol{
    public boolean plain(int i, String s){
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length()-1-i))return false;
        return plain(i + 1, s);

    }

}
