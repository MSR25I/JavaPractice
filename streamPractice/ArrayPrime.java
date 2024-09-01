package streamPractice;

import java.util.Arrays;

public class ArrayPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int[] arr = {2, 3, 5, 7, 9, 11, 13};

		        Arrays.stream(arr) // Create a stream from the array
		              .filter(ArrayPrime::isPrime) // Filter to keep only prime numbers
		              .forEach(System.out::println); // Print each prime number
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false; 
		        }
		        if (number == 2) {
		            return true; 
		        }
		        if (number % 2 == 0) {
		            return false; 
		        }
		        
		        for (int i = 3; i <= Math.sqrt(number); i += 2) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        return true; 
		    


	}

}
