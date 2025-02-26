package practice;
import java.util.HashMap;
import java.util.Map;

public class SubstringOccurrences {
    public static void main(String[] args) {
        String input = "abcaabcabcaabbabc";
        Map<String, Integer> occurrences = countSubstrings(input);

        // Print the occurrences
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
        }
    }

    private static Map<String, Integer> countSubstrings(String str) {
        Map<String, Integer> substringCount = new HashMap<>();

        // Get all possible substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);
            }
        }

        return substringCount;
    }
}
