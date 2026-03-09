import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascaleTRow {
    public static void main(String[] args) {
        PascaleTRow ptr  = new PascaleTRow();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter nmber row");
        int rowNum = sc.nextInt();

        List<Integer> row = ptr.generate(rowNum);
        System.out.println("Row" + rowNum +  " of Pascal's Triangle: " + row);
        sc.close();

    }
    public List<Integer> generate(int numRows) {
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
