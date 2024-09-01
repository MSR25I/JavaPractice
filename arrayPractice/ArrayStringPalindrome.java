package arrayPractice;

public class ArrayStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"level","raja","morning","turn","side","madam"};
	    
		        
		        // Print palindromes
		        System.out.println("Palindrome strings in the array are:");
		        for (String s : str) {
		            if (isPalindrome(s)) {
		                System.out.println(s);
		            }
		        }
		    }
		    
		    // Method to check if a string is a palindrome
		    public static boolean isPalindrome(String str) {
		        // Convert the string to lower case to handle case insensitivity
		        str = str.toLowerCase();
		        
		        // Initialize variables for start and end of the string
		        int start = 0;
		        int end = str.length() - 1;
		        
		        // Check if characters from start and end are the same
		        while (start < end) {
		            if (str.charAt(start) != str.charAt(end)) {
		                return false; // Not a palindrome
		            }
		            start++;
		            end--;
		        }
		        
		        // If the loop completes, it is a palindrome
		        return true;


	}

}
