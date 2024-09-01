package practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String: ");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		 String rev="";
			 
			for(int i=str.length()-1;i>=0;i--) {
			
			 rev=rev+str.charAt(i);
			 
		 }
			System.out.println("Rverse string of the given String: "+rev);
			
			if(rev.equalsIgnoreCase(str)) {
				System.out.println(str+" is a Palindrome");
			}
			else {
				System.out.println(str+" is not a Palindrome");
			}
		}
		
	}