public class Triangle {
    public static void main(String[] args) {
        int n = 5;

        /* for 1 to 123 use j for print and 1 22 333 use i and inverted i = n i >1 i--  */
        for( int i = n; i>=1; i--){
            for (int j =1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
