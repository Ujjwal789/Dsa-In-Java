import java.util.ArrayList;

public class SmallestAndLargest {
    public static void main(String[] args) {
        String input = "I am Progremer";  // example input
        ArrayList<String> res = smallerAndLarge(input);
        System.out.println("Smallest: " + res.get(0) + ", Largest: " + res.get(1));
    }


    public static ArrayList<String> smallerAndLarge(String s) {
        String[] words = s.split("\\s+");

        String small = words[0];  // initialize with the first word
        String large = words[0];

        for (int i = 1; i < words.length; i++) {
            String word = words[i];

            // Check for smaller word (first occurring in case of tie)
            if (word.length() < small.length()) {
                small = word;
            }

            // Check for larger word (last occurring in case of tie)
            if (word.length() >= large.length()) {
                large = word;
            }
        }

        // Prepare result
        ArrayList<String> result = new ArrayList<>();
        result.add(small);
        result.add(large);

        return result;
    }
}
