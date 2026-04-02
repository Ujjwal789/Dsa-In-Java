public class RowWithMaxOnes {
    public static void main(String[] args) {
        int [][]  nums = {{0,0,0},{0,1,1},{1,1,1}};
        int result = MaxOnes(nums);
        System.out.println(result);

    }
    public static int findindex(int[] num, int x){
        int low =0;
        int high = num.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(num[mid]>=x){
                high = mid -1;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
    public static int MaxOnes(int [][] nums){
        int countmax = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            int firstindex = findindex(nums[i], 1);
            int firstcount = nums[i].length-firstindex;
            if (firstcount>countmax){
                countmax = firstcount;
                index = i;
            }
        }

        return  countmax;

    }
}
