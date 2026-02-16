import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        // Create object of class re
        re obj = new re();

        //initialise array
        int [] arr = {1,2,3,4,5};

        //call reversed array
        obj.reverse(arr);

        //print reverse array
        for (int num : arr){
            System.out.println(num);
        }

    }
}
class re {
    // function to reverse an array
    public void reverse(int[] arr) {

        // 2 pointer initalise

        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2]= temp;
            // Move the left pointer one step to the right
            p1++;

            // Move the right pointer one step to the left
            p2--;

        }


    }
}
