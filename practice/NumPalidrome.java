package practice;

import java.util.Scanner;

public class NumPalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp>0) {
			int temp1=temp%10;
			rev=rev*10+temp1;
			temp=temp/10;
			
			
		}
		System.out.println("Reverse of the Given number: "+rev);
		if(rev==num) {
			System.out.println(num+" is a Palindrome");
		}
		
		else {
			System.out.println(num+" is not a Palindrome");
		}
	}

}
