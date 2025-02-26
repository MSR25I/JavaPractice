package practice;
public class KeywordCounter {
  
    public static int countKeywordOccurrences(String keyword, String[] comments) {
        int count = 0;
        // Convert the keyword to lower case for case insensitive comparison
        String lowerKeyword = keyword.toLowerCase();

        for (String comment : comments) {
            // Convert each comment to lower case before checking
            if (comment.toLowerCase().contains(lowerKeyword)) {
                count++;
            }
        }
        return count;
    }
        
        public static void main(String[] args) {
            int N = 3;
            String S = "bad";
            String[] comments = {"The_video_is_BAD", "bad_bad_bad","bad"};
            
            int count = countKeywordOccurrences(S, comments);
            System.out.println(count);  // Output: 2

    }
}
