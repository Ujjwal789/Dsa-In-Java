public class NumberIntoRoman {
    public static void main(String[] args) {
        int n = 654;
        String result = convertToRoman(n);
        System.out.println(result);

    } static String convertToRoman(int n) {
        // code here
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40,
                10, 9, 5, 4, 1};

        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < values.length; i++){
            while(n >= values[i]){
                n -= values[i];
                result.append(romans[i]);
            }
        }

        return result.toString();
    }
}
