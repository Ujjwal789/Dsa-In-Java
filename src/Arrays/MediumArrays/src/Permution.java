public class Permution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        nextPermutation(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
        public static void nextPermutation(int[] nums) {
            // Your code goes here
            int n = nums.length;
            int index = -1;
            if(nums == null || n <= 1)return;

            for(int i =n-2; i>=0; i--){
                if(nums[i] < nums[i+1]){
                    index =i;
                    break;
                }
            }
            if(index == -1){
                reverse(nums, 0 ,n-1);
                return;
            }
            for(int i =n-1; i>index; i--){
                if(nums[i] > nums[index]){
                    swap(nums, index, i);
                    break;
                }
            }

            reverse(nums, index + 1, n - 1);
        }



        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }


        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

}
