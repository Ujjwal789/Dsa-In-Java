public class Findmissing {
    public static void main(String[] args) {
        int[] nums ={1,2,3,5};
        System.out.println(misssing(nums));

    }
    public static int misssing(int[] nums){
        int n = nums.length + 1;

        for (int i = 1; i <= n; i++) {
            int count =0;
            for (int j = 0; j <nums.length; j++) {
                if(nums[j] == i) {
                    count++;
                    break;
                }

            }
            if (count == 0){
                return i;
            }

        }
        return -1;

    }

}
