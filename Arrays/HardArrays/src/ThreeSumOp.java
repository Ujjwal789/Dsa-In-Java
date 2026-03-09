import java.util.*;

public class ThreeSumOp {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> res = threeSumOp(arr);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
  public static List<List<Integer>> threeSumOp(int[] nums) {
                int n = nums.length;
                List<List<Integer>> ans = new ArrayList<>();

                Arrays.sort(nums);

                for (int i = 0; i < n; i++) {

                    if (i > 0 && nums[i] == nums[i - 1]) continue;

                    int left = i + 1, right = n - 1;

                    while (left < right) {
                        int sum = nums[i] + nums[left] + nums[right];

                        if (sum == 0) {
                            ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                            left++;
                            right--;

                            while (left < right && nums[left] == nums[left - 1]) left++;
                            while (left < right && nums[right] == nums[right + 1]) right--;
                        }
                        else if (sum < 0) left++;
                        else right--;
                    }
                }

                return ans;
            }
    }


