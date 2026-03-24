public class FindRepeatMiss {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,1,1};

        int[] result = find(arr);
        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);

    }
    public static int[] find(int[] arr){
        int n = arr.length;
        int repeation = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j] == i){
                    count++;
                }
            } if (count == 2) repeation = i;
            else if (count == 0) missing = i;

            if(repeation != -1  && missing != -1){
                break;
            }

        }
        return new int[]{repeation, missing};
    }

}
