
import java.util.*;

public class MergeOverlappingSub {
    public static void main(String[] args) {
        int[][] nums = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(nums);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int start  = intervals[i][0];
            int end  = intervals[i][1];
            int j = i+1;
            while(j<n && intervals[j][0]<= end){
                end = Math.max(end, intervals[j][1]);
                j++;
            }ans.add(Arrays.asList(start, end));
            i = j;
        }

        int[][] res = new int[ans.size()][2];
        for(int k = 0; k < ans.size(); k++){
            res[k][0] = ans.get(k).get(0);
            res[k][1] = ans.get(k).get(1);
        }

        return res;
    }
}



