package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
	    int temp=1;
	    	for(int i=1;i<=num;i++) {
	    		temp= temp*(i);
	    	}
	    	System.out.println("Factorial of the given number: "+temp);
	}

}
