package arrayPractice;

public class ArrayNumPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {121,453,216,389,101,234};

		        // Print palindromes
		        System.out.println("Palindrome numbers in the array are:");
		        for (int n : num) {
		            if (isPalindrome(n)) {
		                System.out.println(n);
		            }
		        }
		    }
		    
		    // Method to check if a number is a palindrome
		    public static boolean isPalindrome(int number) {
		        // Handle negative numbers (they are not palindromes)
		        if (number < 0) {
		            return false;
		        }
		        
		        // Convert number to string to easily check for palindrome
		        String str = Integer.toString(number);
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
