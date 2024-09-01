package javaSe8;

public class StringPalindromeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] str= {"RAJA","MADAM","MALAYALAM","SPIRIT","DREAM"};
	
		        String[] strings = {"radar", "hello", "level", "world", "madam", "java", "racecar", "apple"};

		        System.out.println("Palindrome strings in the array:");
		        for (String str : strings) {
		            if (isPalindrome(str)) {
		                System.out.println(str);
		            }
		        }
		    }

		    // Method to check if a string is a palindrome
		    public static boolean isPalindrome(String str) {
		        int left = 0;
		        int right = str.length() - 1;

		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false; // Not a palindrome
		            }
		            left++;
		            right--;
		        }
		        return true; // Is a palindrome
		    

	}

}
