public class KthElemntinTwoArray {
    public static void main(String[] args) {
        int[] a={2,8};
        int[] b={3,4,0};
        int k = 1;
        int result = kthElement(a,b,k);
        System.out.println(result);
    }
        public static int kthElement(int[] a, int[] b, int k) {
            int n1 = a.length;
            int n2 = b.length;
            int[] arr3 = new int[n1 + n2];
            int i = 0;
            int j = 0;
            int p = 0;
            while(i<n1 && j<n2){
                if(a[i]<b[j]){
                    arr3[p++] = a[i++];
                }else{
                    arr3[p++] = b[j++];
                }
            }while(i<n1){
                arr3[p++] = a[i++];
            }while(j<n2){
                arr3[p++] = b[j++];
            }
            return arr3[k - 1];
        }
}


