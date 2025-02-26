package practice;
import java.util.HashMap;
import java.util.Map;

public class SubstringOccurrences2 {
    public static void main(String[] args) {
        String input = "abcaabcabcaabbabc";
        Map<String, Integer> occurrences = countSubstrings(input);

        // Print the occurrences in the desired format
        for (String substring : new String[]{"abc", "aa", "bca"}) {
            int count = occurrences.getOrDefault(substring, 0);
            System.out.println(substring + " - " + count + " times");
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
