package practice;

import java.util.Arrays;

public class AnagramChecker {
    
    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lower case
     //   str1 = str1.replaceAll("\\s+", "").toLowerCase();
      // str2 = str2.replaceAll("\\s+", "").toLowerCase();
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "GoD";
        String str2 = "dOg";

        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        
        } else {
           System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }
}
