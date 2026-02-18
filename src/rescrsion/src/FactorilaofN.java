import java.util.Scanner;

public class FactorilaofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int i = sc.nextInt();

        int result = fact.sumofhelper(i);
        System.out.println("Factorial = " + result);

    }
}
class fact{
    static int sumofhelper(int i){
        if (i==0){

            return 1;
        }
        return i * sumofhelper(i-1);


    }

}


