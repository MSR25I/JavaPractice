package javaSe8;

public class BinaryPalindrome {
	public static void main(String[] args) {
	
		
		int number=5;
		
		  StringBuilder binaryString = new StringBuilder();
		
	      while (number > 0) {
	            binaryString.append(number % 2);  // Append the remainder (0 or 1)
	            number /= 2;   
		
	}
	      binaryString.reverse();
		
		 System.out.println("Binary representation: " + binaryString);
		 
		 if (palindrome(binaryString.toString())) {
	            System.out.println("The binary representation is a palindrome.");
	        } else {
	            System.out.println("The binary representation is not a palindrome.");
	        }
	}
		   public static boolean palindrome(String str) {
		        int left = 0;
		        int right = str.length() - 1;

		        // Compare characters from both ends towards the center
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
		
	
	
