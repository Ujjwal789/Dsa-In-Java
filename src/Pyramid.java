public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row<=n; row++){
            for (int space = 1; space <= n-row;  space++ ){ //beacuse one time row = 5, 5-5 = 0
                System.out.print(" ");
            }for (int star = 1; star <= (2*row-1);  star++ ){
                System.out.print(" *");
            }
            // Move to next line
            System.out.println();
        }

    }
}
