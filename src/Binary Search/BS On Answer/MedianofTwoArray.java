public class MedianofTwoArray {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                nums3[k++] = nums1[i++];
            }else{
                nums3[k++] = nums2[j++];
            }
        }while(i<n1){
            nums3[k++] = nums1[i++];
        }while(j<n2){
            nums3[k++] = nums2[j++];
        }
        int n = n1 + n2;
        if(n%2==1){
            return nums3 [n/2];
        }else{
            return (nums3 [n/2] + nums3[n/2-1])/2.0;
        }
    }

}
