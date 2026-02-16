import java.util.Scanner;

class PrintOneToN {
    static void PrintNumber( String name, int count ){
        if (count == 0){
            return;
        }

        System.out.println(name);

        PrintNumber(name, count - 1 );

    }
}
public class recurision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter how many times: ");
        int count = sc.nextInt();;
        PrintOneToN.PrintNumber(name, count);
    }
}
