package practice;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentance1 {

    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        
        // Iterate through the string to collect words
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                temp.append(c);
            } else if (temp.length() > 0) {
                words.add(temp.toString());
                temp.setLength(0); // Reset temp for the next word
            }
        }
        
        // Append the last word if there is any
        if (temp.length() > 0) {
            words.add(temp.toString());
        }
        
        // Reverse the list of words
        int i = 0;
        int j = words.size() - 1;
        while (i < j) {
            String tempStr = words.get(i);
            words.set(i, words.get(j));
            words.set(j, tempStr);
            i++;
            j--;
        }
        
        // Join the reversed words into a single string and return
        return String.join(" ", words);
    }

    public static void main(String[] args) {
    	ReverseSentance1 sol = new ReverseSentance1();
        String result = sol.reverseWords("the sky is blue");
        System.out.println(result);  // Output: "blue is sky the"
    
		
		
	}

}
