import static java.lang.Math.max;

public class appearsOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,8,3,3,4,4,6};
        System.out.println(Appear(arr));
    }
    public static int Appear(int[] arr){  //USE XOR FOR BEST APPROCH
        int n = arr.length;
        int maxi =0;

        for (int i = 0; i < n; i++) {
            maxi = max(maxi, arr[i]);
        }

        // Create hash array
        int[] hash = new int[maxi + 1];
            for (int j = 0; j < n; j++) {
                hash [arr[j]]++;
            }

            for (int j = 0; j < n; j++) {
               if(hash[arr[j]] == 1){
                   return arr[j];
               }
            }


        return -1;
    }
}
