public class FindReapeatMissBetter {
    public static void main(String[] args) {
        int[] arr = {2,3,3,5,6,1};
        int[] result = findbetter(arr);
        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
    public static int[] findbetter(int[] arr){
        int n = arr.length;
        int[] hash = new int[n + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        int repteatiting = -1; int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2){
                repteatiting = i;
            } else if (hash[i] == 0) {
                missing = i;
            }
            if (repteatiting != -1 && missing != -1){
                break;
            }
        }
        return new  int[]{repteatiting, missing};
    }
}
