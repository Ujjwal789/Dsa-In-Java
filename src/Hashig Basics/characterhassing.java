import java.util.Scanner;

public class characterhassing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();

        //precompute
        int[] hash = new int[26]; // use 256

        for (int i = 0; i<s.length(); i++){
            hash[s.charAt(i) - 'a']++;  // if lower case (i) - a remove

        }


        while (true){
            System.out.println("enter the charcater query");
            char c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']); // if lower case [c -a] remove a
        }
    }
}
