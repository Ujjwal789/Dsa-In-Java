public class appearsOnceOptimal {
    public static void main(String[] args) {
        int[] nums = {1,1,8,3,3,4,4};
        System.out.println(Appear(nums));
    }
    public static int Appear(int[] nums){
        int  Xor = 0;
        for (int i  =0; i<nums.length; i++){
            Xor = Xor^nums[i];
        }
          return Xor;
    }
}
