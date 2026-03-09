public class CountInversionMerge {

    static int merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0, inv = 0;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inv += (m - i + 1);
            }
        }

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        for (i = l; i <= r; i++)
            arr[i] = temp[i - l];

        return inv;
    }

    static int mergeSort(int[] arr, int l, int r) {
        if (l >= r) return 0;

        int m = (l + r) / 2;

        return mergeSort(arr, l, m)
                + mergeSort(arr, m + 1, r)
                + merge(arr, l, m, r);
    }

    static int numberOfInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Inversions: " + numberOfInversions(arr));
    }
}