public class MergesortedGap {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        mergeGaap(arr1, arr2, arr1.length, arr2.length);

        for (int x : arr1)
            System.out.print(x + " ");
        for (int x : arr2)
            System.out.print(x + " ");
    }
    private static void swapGreater(int[] arr1, int[] arr2, int ind1 , int ind2){
        if (arr1[ind1] > arr2[ind2]){
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
    public static void mergeGaap(int[] arr1, int[] arr2, int n , int m){
        int len = n + m;
        int gap = (len / 2)+(len % 2);
        while (gap > 0){
            int left = 0;
            int right = left + gap;
            while (right < len){
                if (left < n && right >=n){
                    swapGreater(arr1, arr2, left, right-n);
                } else if (left >= n) {
                    swapGreater(arr2, arr2, left-n, right-n);
                }else {
                    swapGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if (gap == 1)break;
            gap = (gap / 2)+(gap % 2);
        }

    }
}

