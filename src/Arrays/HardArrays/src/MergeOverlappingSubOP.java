import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingSubOP {
    public static void main(String[] args) {
        int[][] nums = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = mergeOP(nums);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
    public static int[][] mergeOP(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                current = intervals[i];
            }
        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }
}

