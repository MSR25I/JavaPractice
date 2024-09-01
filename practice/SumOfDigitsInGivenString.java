package practice;

import java.util.Scanner;

public class SumOfDigitsInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int count=0;
		int sum=0;
		for(int i=0;i<=str.length()-1;i++) {
		char f=str.charAt(i);
		if(f >= '0' && f <= '9') {
			 sum=sum+f;
			 count++;
		}
		}
		int c=count*48;
		System.out.println(count);
		System.out.println("Sum of the Digits: "+(sum-c));
	}

}
