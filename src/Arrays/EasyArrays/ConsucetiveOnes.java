public class ConsucetiveOnes {
    public static void main(String[] args) {
        int[] nums ={1,1,0,1,1,1,0,1,1};
        System.out.println(Cons(nums));
    }

    public static int Cons(int[] nums) {
        int max =0;
        int count =0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max = count;
                }
            }else{
                count=0;
            }
        }

        return max;

    }
}
