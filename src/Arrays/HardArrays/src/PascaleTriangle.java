import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascaleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PascaleTElement pte = new PascaleTElement();
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        System.out.println("Pascal's Triangle up to row " + numRows + ":");
        for (int r = 1; r <= numRows; r++) {
            List<Integer> row = generate(r);

            // Print leading spaces for triangle formatting
            for (int s = 0; s < numRows - r; s++) {
                System.out.print("  ");
            }

            // Print elements in the row
            for (int val : row) {
                System.out.print(val + "   ");
            }
            System.out.println();
        }

        sc.close();
    }

    public  static List<Integer> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        int n = numRows - 1;
        for(int i  = 0; i<=n; i++){
            row.add((int)ans);
            ans = ans * (n - i) / (i + 1);
        }
        return row;
    }
}
