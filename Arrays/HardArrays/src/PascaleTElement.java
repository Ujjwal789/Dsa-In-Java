import java.util.Scanner;

public class PascaleTElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PascaleTElement pte = new PascaleTElement();

        System.out.print("Enter row number (r): ");
        int r = scanner.nextInt();

        System.out.print("Enter column number (c): ");
        int c = scanner.nextInt();

        int element = pte.pascalTriangleI(r, c);
        System.out.println("Element at row " + r + ", column " + c + " is: " + element);

        scanner.close();

    }
    public int pascalTriangleI(int r, int c) {
        int n = r- 1;
        int k = c - 1;
        int res = 1;
        for(int i = 0; i<k; i++){
            res = res*(n-i);
            res = res/(i+1);
        }

        return res;

    }
}
