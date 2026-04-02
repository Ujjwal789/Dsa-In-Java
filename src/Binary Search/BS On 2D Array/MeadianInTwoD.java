import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeadianInTwoD {
    public static void main(String[] args) {

        // Define the matrix
        int[][] matrix = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        // Print the median
        System.out.println(findMedian(matrix));
    }
    public static int findMedian(int[][] matrix) {
        List<Integer> elements = new ArrayList<>();
        for (int[] row : matrix) {
            for (int val : row) {
                elements.add(val);
            }
        }
        Collections.sort(elements);
        int n = elements.size();
        return elements.get(n / 2);
    }
}
