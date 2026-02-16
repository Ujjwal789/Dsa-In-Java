import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            //print left numbers
            for (int j = i; j <= row-1; j++) {
                System.out.print(j );
            }

//
//            //for spaces
//            int spaces = 2 * (row - i) * 2;
//            for (int s = 1; s <= spaces; s++) {
//                System.out.print(" ");
//            }
//
//            //right
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j + " ");
//            }


            System.out.println();

        }

        sc.close();
    }
}

